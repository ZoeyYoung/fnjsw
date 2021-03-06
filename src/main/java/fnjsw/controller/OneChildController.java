package fnjsw.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.entity.Familyplanningcertificate;
import fnjsw.entity.Division;
import fnjsw.entity.Gestationinfo;
import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import fnjsw.service.impl.OnechildarchivesServiceImpl;
import fnjsw.util.CommonUtils;
import fnjsw.util.OnePage;
import fnjsw.util.Page;

@Controller
@RequestMapping(value = "/oneChild/")
public class OneChildController {
    private static final Logger logger = LoggerFactory
            .getLogger(OneChildController.class);

    private static JsonMapper mapper = JsonMapper.nonDefaultMapper();

    @Autowired
    private OnechildarchivesServiceImpl ocaService;

    @InitBinder
    protected void init(HttpServletRequest request,
            ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
        // initDataBinder(request, binder);
    }

    /**
     * 获取档案列表
     * 
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getList(HttpServletRequest request, Model model) {
        model.addAttribute("ocaQueryParam", new Onechildarchives());
        return "oneChildManager";
    }

    /**
     * 跳转到添加用户页面(get请求)
     * 
     * @return
     */
    @RequestMapping(value = "new", method = RequestMethod.GET)
    public String createForm(Model model) {
        model.addAttribute("oca", new Onechildarchives());
        model.addAttribute("action", "new");
        return "oneChildForm";
    }

    /**
     * 添加档案信息处理方法(post请求)
     * 
     * @param oca
     * @param model
     * @return
     */
    @RequestMapping(value = "new", method = RequestMethod.POST)
    public String save(@Valid Onechildarchives oca, BindingResult result,
            Model model) {
        logger.debug("Result Has Errors: " + result.hasErrors());
        if (result.hasErrors()) {
            model.addAttribute("oca", oca);
            model.addAttribute("action", "new");
            return "oneChildForm";
        }
        ocaService.saveOca(oca);
        model.addAttribute("message", "创建成功");
        return "redirect:/oneChild/list";
    }

    @RequestMapping(value = "newGi/{id}", method = RequestMethod.POST)
    public String saveGi(@PathVariable("id") int ocaId,
            HttpServletRequest request,
            Model model) {
        logger.debug("ocaId: " + ocaId);
        Gestationinfo gi = new Gestationinfo();
        gi.setOcaid(ocaId);
        gi.setServicetime(new Date());
        gi.setServiceresult(request.getParameter("serviceResult"));
        gi.setServiceperson(request.getParameter("servicePerson"));
        ocaService.saveGi(gi);
        model.addAttribute("message", "创建成功");
        return "redirect:/oneChild/update/" + ocaId;
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.GET)
    public String updateForm(@PathVariable("id") int id, Model model) {
        // 获取需要更新的对象
        model.addAttribute("oca", ocaService.getOcaById(id));
        model.addAttribute("gis", ocaService.getGiByOcaId(id));
        model.addAttribute("fpcs", ocaService.getFpcByOcaId(id));
        model.addAttribute("action", "update");
        return "oneChildForm";
    }

    @RequestMapping(value = "updateGi/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String updateGi(@PathVariable("id") int giId,
            HttpServletRequest request,
            Model model) {
        logger.debug("giId: " + giId);
        Gestationinfo gi = ocaService.getGiById(giId);
        gi.setServicetime(new Date());
        gi.setServiceresult(request.getParameter("serviceResult"));
        gi.setServiceperson(request.getParameter("servicePerson"));
        ocaService.updateGi(gi);
        model.addAttribute("message", "创建成功");
        return "";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@Valid Onechildarchives oca, BindingResult result,
            Model model) {
        logger.debug("Result Has Errors: " + result.hasErrors());
        if (result.hasErrors()) {
            model.addAttribute("oca", oca);
            model.addAttribute("action", "update");
            return "oneChildForm";
        }
        ocaService.updateOca(oca);
        model.addAttribute("message", "更新成功");
        return "redirect:/oneChild/list";
    }

    @RequestMapping(value = "updateComment", method = RequestMethod.POST)
    public String updateComment(@Valid Onechildarchives oca,
            BindingResult result,
            Model model) {
        logger.debug("Result Has Errors: " + result.hasErrors());
        if (result.hasErrors()) {
            model.addAttribute("oca", oca);
            model.addAttribute("action", "update");
            return "oneChildForm";
        }
        Onechildarchives originOca = ocaService.getOcaById(oca.getId());
        originOca.setComment(oca.getComment());
        ocaService.updateOca(originOca);
        model.addAttribute("message", "更新成功");
        return "redirect:/oneChild/update/" + oca.getId();
    }

    @RequestMapping(value = "uploadFPC/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFPC(@PathVariable("id") int ocaId,
            @RequestParam("imageFile") MultipartFile file,
            Model model) {
        try {
            Familyplanningcertificate fpc = new Familyplanningcertificate();
            String filename =
                    saveMutipartFile(CommonUtils.getFPCDir(ocaId), file);
            fpc.setOcaid(ocaId);
            fpc.setFilename(filename);
            fpc.setUploadtime(new Date());
            ocaService.saveFpc(fpc);
        } catch (IllegalStateException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping(value = "uploadZSZ/{id}", method = RequestMethod.POST)
    public String uploadZSZ(@PathVariable("id") int ocaId,
            @RequestParam("zsz") MultipartFile[] file,
            Model model) {
        try {
            Onechildarchives oca = ocaService.getOcaById(ocaId);
            if (StringUtils.isNotEmpty(oca.getZhunshengzheng())) {
                FileUtils.deleteQuietly(CommonUtils.getZSZFile(ocaId,
                        oca.getZhunshengzheng()));
            }
            String filename =
                    saveMutipartFile(CommonUtils.getZSZDir(ocaId), file[0]);
            if (StringUtils.isNotEmpty(filename)) {
                oca.setZhunshengzheng(filename);
            }
            ocaService.updateOca(oca);
        } catch (IllegalStateException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "redirect:/oneChild/update/" + ocaId;
    }

    @RequestMapping("preview/{fpcId}")
    public void previewFPC(@PathVariable("fpcId") int fpcId,
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        Familyplanningcertificate fpc = ocaService.getFpcById(fpcId);
        File file = CommonUtils.getFPCFile(fpc.getOcaid(), fpc.getFilename());
        InputStream is = new FileInputStream(file);
        OutputStream os = response.getOutputStream();
        byte[] bt = new byte[1024];
        int len = -1;
        while ((len = is.read(bt)) != -1) {
            os.write(bt, 0, len);
        }
        response.setContentType("application/bmp");
        os.write("\r\n".getBytes());
        os.flush();
        os.close();
        is.close();
    }

    @RequestMapping("previewZSZ/{ocaId}")
    public void previewZSZ(@PathVariable("ocaId") int ocaId,
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        Onechildarchives oca = ocaService.getOcaById(ocaId);
        File file = CommonUtils.getZSZFile(ocaId, oca.getZhunshengzheng());
        InputStream is = new FileInputStream(file);
        OutputStream os = response.getOutputStream();
        byte[] bt = new byte[1024];
        int len = -1;
        while ((len = is.read(bt)) != -1) {
            os.write(bt, 0, len);
        }
        response.setContentType("application/bmp");
        os.write("\r\n".getBytes());
        os.flush();
        os.close();
        is.close();
    }

    private String saveMutipartFile(File dir, MultipartFile mpf)
            throws IllegalStateException, IOException {
        if (mpf.getSize() == 0L) {
            return "";
        }
        String newFilenameBase = UUID.randomUUID().toString();
        String originalFileExtension =
                mpf.getOriginalFilename().substring(
                        mpf.getOriginalFilename().lastIndexOf("."));
        String newFilename = newFilenameBase + originalFileExtension;
        File newFile = new File(dir.getAbsolutePath() + "/" + newFilename);
        mpf.transferTo(newFile);
        return newFilename;
    }

    /**
     * 删除一孩档案
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(HttpServletRequest request,
            HttpServletResponse response) {
        // 一孩档案id
        int id = Integer.parseInt(request.getParameter("id"));
        // 删除妊娠信息
        ocaService.deleteGiByOcaId(id);
        try {
            // 删除计生证件扫描件
            FileUtils.deleteDirectory(CommonUtils.getFPCDir(id));
            // 删除准生证扫描件
            FileUtils.deleteDirectory(CommonUtils.getZSZDir(id));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 删除一孩档案
        int result = ocaService.deleteOca(id);
        if (result == 1) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "deleteGi/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String deleteGi(@PathVariable("id") int id) {
        // 删除记录前先删除文件
        int result = ocaService.deleteGi(id);
        if (result == 1) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("deleteFPC/{fpcId}")
    @ResponseBody
    public String deleteFPC(@PathVariable("fpcId") int fpcId,
            Model model) {
        Familyplanningcertificate fpc = ocaService.getFpcById(fpcId);
        int result = ocaService.deleteFpc(fpcId);
        if (result == 1) {
            File file =
                    CommonUtils.getFPCFile(fpc.getOcaid(), fpc.getFilename());
            FileUtils.deleteQuietly(file);
            return "success";
        }
        return "fail";
    }

    @RequestMapping("deleteZSZ/{ocaId}")
    @ResponseBody
    public String deleteZSZ(@PathVariable("ocaId") int ocaId,
            Model model) {
        Onechildarchives oca = ocaService.getOcaById(ocaId);
        String filename = oca.getZhunshengzheng();
        oca.setZhunshengzheng("");
        int result = ocaService.updateOca(oca);
        if (result == 1) {
            File file = CommonUtils.getZSZFile(ocaId, filename);
            FileUtils.deleteQuietly(file);
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "query")
    @ResponseBody
    public String getPage(@ModelAttribute Onechildarchives ocaQueryParam,
            HttpServletRequest request) {
        OnechildarchivesExample example = new OnechildarchivesExample();
        // 根据某个条件，当前位置、每页多少条记录
        int start = Integer.parseInt(request.getParameter("start"));
        int limit = Integer.parseInt(request.getParameter("limit"));
        Page page = new Page(start, limit);
        logger.debug(page.toString());
        Date startdate = null;
        Date enddate = null;
        try {
            if (StringUtils.isNotEmpty(request.getParameter("startdate"))) {
                startdate =
                        new SimpleDateFormat("yyyy/MM/dd").parse(URLDecoder
                                .decode(request.getParameter("startdate"),
                                        "UTF-8"));
            }
            if (StringUtils.isNotEmpty(request.getParameter("enddate"))) {
                enddate =
                        new SimpleDateFormat("yyyy/MM/dd").parse(URLDecoder
                                .decode(request.getParameter("enddate"),
                                        "UTF-8"));
            }
        } catch (ParseException | UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        example.setPage(page);
        // 根据条件 ，按什么顺序
        example.setOrderByClause("ID DESC");

        OnePage<Onechildarchives> userPageData =
                ocaService
                        .selectOnePage(example, ocaQueryParam, startdate,
                                enddate);

        String pageDataString = mapper.toJson(userPageData.getDataList());
        String jsonResult =
                "{\"rows\":" + pageDataString + ",\"total\":"
                        + userPageData.getPage().getCount() + "}";
        return jsonResult;
    }

    @RequestMapping(value = "queryDivision", method = RequestMethod.GET)
    @ResponseBody
    public String queryDivision(HttpServletRequest request,
            HttpServletResponse response) {
        String code = request.getParameter("code");
        List<Division> divList = ocaService.queryDivByCode(code);
        return mapper.toJson(divList);
    }
    
    @RequestMapping(value = "getDivision", method = RequestMethod.GET)
    @ResponseBody
    public String getDivision(HttpServletRequest request,
            HttpServletResponse response) {
        String code = request.getParameter("code");
        List<Division> divList = ocaService.getDivByCode(code);
        return mapper.toJson(divList);
    }

    @RequestMapping(value = "queryGestation")
    @ResponseBody
    public String getGestationInfo(int ocaId, HttpServletRequest request) {
        List<Gestationinfo> giList = ocaService.getGiByOcaId(ocaId);
        String pageDataString = mapper.toJson(giList);
        String jsonResult =
                "{\"rows\":" + pageDataString + ",\"total\":"
                        + giList.size() + "}";
        return jsonResult;
    }

}
