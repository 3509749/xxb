package com.sc.xxb.admin.controller;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sc.xxb.admin.model.UUser;
import com.sc.xxb.base.mapper.DictMapper;
import com.sc.xxb.base.model.DictItem;
import com.sc.xxb.base.model.DictTable;
import com.sc.xxb.business.yw.model.*;
import com.sc.xxb.business.yw.service.*;
import com.sc.xxb.util.CommonUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sc.xxb.admin.model.MainProps;
import com.sc.xxb.admin.service.RoleService;
import com.sc.xxb.admin.service.UserService;

 
@Controller
@RequestMapping("/")
public class LoginController {
	 private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private RoleService roleService;
	@Autowired
	private MainProps mainProps;
    @Autowired
    private DictMapper dictMapper;
	@Autowired
	private XxbUserService xxbUserService;
	/**s
	 * 跳转到主页
	 * @param request
	 * @return
	 */
	@RequestMapping("/")
	public String homepage(ModelMap map){
	    return "index";
    }

    @RequestMapping("/video")
    public String video(ModelMap map){
        return "video";
    }

	@RequestMapping("/login")
	public String login(ModelMap map){
		return "login";
	}

	@RequestMapping("/register")
	public String register(ModelMap map){
		return "register";
	}

	@RequestMapping("/aboutUs")
	public String aboutUs(ModelMap map){
		return "aboutUs";
	}

	@RequestMapping("/editUser")
	public String editUser(ModelMap map){
		UUser user = (UUser)SecurityUtils.getSubject().getPrincipal();
		if(null != user){
			XxbUser xxbUser = xxbUserService.getUserById(user.getUserId());
			map.put("data",xxbUser);
		}else{
			map.put("data",new XxbUser());
		}

		return "editUser";
	}

	@RequestMapping("/detail")
	public String detail(ModelMap map){
		return "detail";
	}

	@RequestMapping("/list")
	public String list(ModelMap map){

		UUser user = (UUser)SecurityUtils.getSubject().getPrincipal();
		map.put("user",user);
		return "list";
	}

	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(ModelMap map, @PathVariable String id){
		UUser user = (UUser)SecurityUtils.getSubject().getPrincipal();
		map.put("user",user);
		return "detail";
	}


    @RequestMapping("/welcome")
    public String welcome(ModelMap map) {
        return "welcome";
    }

	@RequestMapping("/paySuccess")
	public String paySuccess(ModelMap map,String id){
		return "paySuccess";
	}

	/**
	 * 跳转到主页
	 * @param request
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView index(ModelMap modelMap){
		modelMap.put("company",mainProps.getCompany());
		UUser user = (UUser)SecurityUtils.getSubject().getPrincipal();
		modelMap.put("userId",user.getUserId());
		if("1".equals(user.getUserId()))
			modelMap.put("listChild",roleService.listChild());
		else
			modelMap.put("listChild",roleService.listByUserId(user.getUserId()));
		 return new ModelAndView("main",modelMap);
    }
	@RequestMapping("/test")
	public void test(ModelMap map){
		System.out.println("test");
    }

	 @RequestMapping(value="/logout",method=RequestMethod.GET)
     public String logout(RedirectAttributes redirectAttributes ){ 
	        //使用权限管理工具进行用户的退出，跳出登录，给出提示信息
	        SecurityUtils.getSubject().logout();  
	        redirectAttributes.addFlashAttribute("message", "您已安全退出");  
	        return "redirect:/";
	 }
	  /**
	     * ajax登录请求接口方式登陆
	     * @param username
	     * @param password
	     * @return
	     */
	@RequestMapping("/ajaxLogin")
    @ResponseBody
    public Map<String,Object> submitLogin(HttpServletRequest request) {
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("password");
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        try {
        	UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
            SecurityUtils.getSubject().login(token);
            resultMap.put("status", 200);
            resultMap.put("message", "登录成功");
        } catch (Exception e) {

            resultMap.put("status", 500);
            resultMap.put("message", e.getMessage());
            e.printStackTrace();
        }
        return resultMap;
    }

}