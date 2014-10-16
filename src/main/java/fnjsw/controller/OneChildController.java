package fnjsw.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.entity.Gestationinfo;
import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import fnjsw.service.impl.OnechildarchivesServiceImpl;
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

    private String fileUploadDirectory = "D:/uploads";

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
    public String save(@RequestParam MultipartFile[] files,
            @Valid Onechildarchives oca, BindingResult result,
            Model model) {
        logger.debug("Result Has Errors: " + result.hasErrors());
        if (result.hasErrors()) {
            model.addAttribute("oca", oca);
            model.addAttribute("action", "new");
            return "oneChildForm";
        }
        try {
            String filename1 = saveMutipartFile(oca.getFname(),
                    files[0]);
            if (StringUtils.isNotEmpty(filename1)) {
                oca.setFamilyplanningcertificate(filename1);
            }
            String filename2 = saveMutipartFile(oca.getFname(),
                    files[1]);
            if (StringUtils.isNotEmpty(filename2)) {
                oca.setZhunshengzheng(filename2);
            }
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
        ocaService.save(oca);
        model.addAttribute("message", "创建成功");
        return "redirect:/oneChild/list";
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String updateForm(int id, Model model) {
        // 获取需要更新的对象
        model.addAttribute("oca", ocaService.getById(id));
        model.addAttribute("action", "update");
        return "oneChildForm";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@RequestParam MultipartFile[] files,
            @Valid Onechildarchives oca, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            model.addAttribute("oca", oca);
            model.addAttribute("action", "new");
            return "oneChildForm";
        }
        Onechildarchives originOca = ocaService.getById(oca.getId());
        try {
            String filename1 = saveMutipartFile(oca.getFname(),
                    files[0]);
            if (StringUtils.isNotEmpty(filename1)) {
                // 如果重新上传了文件，则删除旧文件
                FileUtils.deleteQuietly(new File(fileUploadDirectory
                        + File.separator
                        + originOca.getFamilyplanningcertificate()));
                oca.setFamilyplanningcertificate(filename1);
            } else {
                oca.setFamilyplanningcertificate(originOca
                        .getFamilyplanningcertificate());
            }
            String filename2 = saveMutipartFile(oca.getFname(),
                    files[1]);
            if (StringUtils.isNotEmpty(filename2)) {
                // 如果重新上传了文件，则删除旧文件
                FileUtils.deleteQuietly(new File(fileUploadDirectory
                        + File.separator
                        + originOca.getZhunshengzheng()));
                oca.setZhunshengzheng(filename2);
            } else {
                oca.setZhunshengzheng(originOca.getZhunshengzheng());
            }
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
        // 获取需要更新的对象
        ocaService.update(oca);
        model.addAttribute("message", "更新成功");
        return "redirect:/oneChild/list";
    }

    private String saveMutipartFile(String name, MultipartFile mpf)
            throws IllegalStateException, IOException {
        if (mpf.getSize() == 0L) {
            return "";
        }
        String newFilenameBase = UUID.randomUUID().toString();
        String originalFileExtension =
                mpf.getOriginalFilename().substring(
                        mpf.getOriginalFilename().lastIndexOf("."));
        String newFilename = name + newFilenameBase + originalFileExtension;
        String storageDirectory = fileUploadDirectory;
        File newFile = new File(storageDirectory + "/" + newFilename);
        mpf.transferTo(newFile);
        return newFilename;
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(HttpServletRequest request,
            HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        // 删除记录前先删除文件
        Onechildarchives originOca = ocaService.getById(id);
        if (StringUtils.isNotEmpty(originOca.getFamilyplanningcertificate())) {
            FileUtils.deleteQuietly(new File(fileUploadDirectory
                    + File.separator
                    + originOca.getFamilyplanningcertificate()));
        }
        if (StringUtils.isNotEmpty(originOca.getZhunshengzheng())) {
            FileUtils.deleteQuietly(new File(fileUploadDirectory
                    + File.separator
                    + originOca.getZhunshengzheng()));
        }
        int result = ocaService.delete(id);
        if (result == 1) {
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
        int limit = Integer.parseInt(request.getParameter("limit"));
        int start = Integer.parseInt(request.getParameter("start"));
        Page page = new Page(start, limit);
        logger.debug(page.toString());

        if (StringUtils.isNotEmpty(request.getParameter("year"))
                && StringUtils.isNotEmpty(request.getParameter("month"))) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR,
                    Integer.parseInt(request.getParameter("year")));
            cal.set(Calendar.MONTH,
                    Integer.parseInt(request.getParameter("month")) - 1);
            ocaQueryParam.setRegistrationdate(cal.getTime());
        }

        example.setPage(page);
        // 根据条件 ，按什么顺序
        example.setOrderByClause("ID DESC");

        OnePage<Onechildarchives> userPageData =
                ocaService.selectOnePage(example, ocaQueryParam);

        String pageDataString = mapper.toJson(userPageData.getDataList());
        String jsonResult =
                "{\"rows\":" + pageDataString + ",\"total\":"
                        + userPageData.getPage().getCount() + "}";
        return jsonResult;
    }

    @RequestMapping(value = "queryGestation")
    @ResponseBody
    public String getGestationInfo(int ocaId, HttpServletRequest request) {
        List<Gestationinfo> giList = ocaService.getGestationInfo(ocaId);
        
        String pageDataString = mapper.toJson(giList);
        String jsonResult =
                "{\"rows\":" + pageDataString + ",\"total\":"
                        + giList.size() + "}";
        return jsonResult;
    }
    
    @RequestMapping(value = "queryDivision", method = RequestMethod.GET)
    @ResponseBody
    public String queryDivision(HttpServletRequest request,
            HttpServletResponse response) {
        String code = request.getParameter("code");
        if ("11".equals(code)) {
            return "{\"divisions\": [{\"code\": \"1101\", \"name\": \"市辖区\"}]}";
        }
        return "";
    }

}
