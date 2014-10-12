package fnjsw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.entity.User;
import fnjsw.entity.UserExample;
import fnjsw.service.IUserService;
import fnjsw.util.Const;
import fnjsw.util.OnePage;
import fnjsw.util.Page;

@Controller
@RequestMapping(value = "/user/")
public class AuthorizationController {

	private static final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);

	private static JsonMapper mapper = JsonMapper.nonDefaultMapper();

	@Autowired
	private IUserService userService;
	
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
	public String userLogin(HttpServletRequest request, HttpServletResponse response){
    	String username = request.getParameter(Const.PARAM_USERNAME);
    	String password = request.getParameter(Const.PARAM_PASSWORD);
    	
    	List<User> userList = userService.getUserByNameAndPwd(username, password);
    	if(userList.size() == 0){
    		return Const.FAIL;
    	}else if(userList.size()==1){
    		return Const.SUCCESS;
    	}
    	return Const.FAIL;
	}
	
    @RequestMapping(value = "newUser", method = RequestMethod.POST)
    @ResponseBody
    public String newUser(HttpServletRequest request, HttpServletResponse response){
    	String username = request.getParameter(Const.PARAM_USERNAME);
    	String password = request.getParameter(Const.PARAM_PASSWORD);
    	
    	User user = new User();
    	user.setName(username);
    	user.setPwd(password);
    	
    	int result = userService.newUser(user);
    	
    	if(result ==1 ){
    		return "success";
    	}
    	return "fail";
    }
    
    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    @ResponseBody
    public String updateUser(HttpServletRequest request, HttpServletResponse response){
    	String id = request.getParameter(Const.PARAM_USERID);
    	String username = request.getParameter(Const.PARAM_USERNAME);
    	String password = request.getParameter(Const.PARAM_PASSWORD);
    	
    	User user = new User();
    	user.setId(Integer.parseInt(id));
    	user.setName(username);
    	user.setPwd(password);
    	
    	int result = userService.updateUser(user);
    	
    	if(result ==1 ){
    		return "success";
    	}
    	return "fail";
    }
    
    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
    @ResponseBody
    public String deleteUser(HttpServletRequest request, HttpServletResponse response){
    	String id = request.getParameter(Const.PARAM_USERID);
    	
    	int idInt = Integer.parseInt(id);

    	int result = userService.deleteUser(idInt);
    	
    	if(result ==1 ){
    		return "success";
    	}
    	return "fail";
    }
    
    
    @RequestMapping(value = "query")
    @ResponseBody
    public String getUserList(@ModelAttribute User userQueryParam, HttpServletRequest request) {
    	
    	UserExample example = new UserExample();
    	
    	// 根据某个条件，当前位置、每页多少条记录
    	int pagesizeTemp = 10;
    	int pageTemp = 0;
    	Page page = new Page(pageTemp, pagesizeTemp);
    	
    	example.setPage(page);
    	
    	// 根据条件 ，按什么顺序
    	example.setOrderByClause("ID DESC");
    	  
    	OnePage<User> userPageData = userService.selectOnePage(example, userQueryParam);
   
    	String pageDataString = mapper.toJson(userPageData.getDataList());
    	String jsonResult = "{\"rows\":" + pageDataString + ",\"total\":" + userPageData.getPage().getCount() + "}";
    	return jsonResult;
    }
	
}
