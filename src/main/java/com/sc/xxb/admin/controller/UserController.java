package com.sc.xxb.admin.controller;
import java.util.List;
import java.util.Map;

import com.sc.xxb.admin.model.UUserRole;
import com.sc.xxb.admin.service.RoleService;
import com.sc.xxb.base.mapper.DictMapper;
import com.sc.xxb.base.model.DictTable;
import com.sc.xxb.business.yw.service.XxbUserService;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.sc.xxb.admin.model.User;
import com.sc.xxb.admin.service.UserService;
import com.sc.xxb.util.CommonUtil;

 
@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private XxbUserService xxbUserService;
	@Autowired
	private DictMapper dictMapper;
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/getUserData")
	@ResponseBody 
	public Map<String, Object> getUserData(User u,int page,int limit){
		return  CommonUtil.jsonPutPageList(userService.getUserByPage(u,page,limit));
	}
	
	/**
	 * 跳转到主页
	 * @param request
	 * @return
	 */

	@RequestMapping("/add")
	@ResponseBody
	public int addUser(User u){
		if(!"".equals(u.getUserId()))
			return userService.updateUser(u);
		else
			return userService.insertUser(u);
	}


	@RequestMapping("/del")
	@ResponseBody
	public int delUsers(String ids){
		return userService.deleteUsers(ids.split(","));
	}
	//跳转编辑页面
	@RequestMapping("/editJsp")
	 public ModelAndView editJsp(String id,ModelMap modelMap)
	    throws Exception
	 {
		modelMap.put("user",userService.getUserById(id));
	    return new ModelAndView("system/userEdit",modelMap);
	 }

	@RequestMapping("/userGivePage")
	public ModelAndView userGivePage(ModelMap modelMap,String userId){
		//拥有权限
		modelMap.put("myRoles",roleService.getRolesByUserId(userId));
		//未有权限
		modelMap.put("otherRoles",roleService.getNotRolesByUserId(userId));
		modelMap.put("userId",userId);
		return new ModelAndView("system/user/userGive",modelMap);
	}

	@RequestMapping("/userRoleEdit")
	@ResponseBody
	public int userRoleEdit(ModelMap modelMap,String roles,String userId){

		JSONArray array = JSONArray.fromObject(roles);
		List<UUserRole> list = JSONArray.toList(array, new UUserRole(), new JsonConfig());
		return roleService.editUserRoles(list,userId);
	}

	@RequestMapping("/userAdd")
	public String userAdd(ModelMap map,@RequestParam(value = "id",required = false,defaultValue = "") String id){
		map.put("userType",dictMapper.getDict(new DictTable("USER_TYPE")));
		map.put("data",userService.getUserById(id));
		return "system/user/userAdd";
	}

	@RequestMapping("/userlist")
	public String userlist(ModelMap map,@RequestParam(value = "userType",required = false,defaultValue = "")String userType){
		map.put("userType",userType);
		return "system/user/userlist";
	}

	@RequestMapping("/userCheck")
	public String userCheck(ModelMap map){
		return "system/userCheck/userlist";
	}

	//跳转修改密码页面
	@RequestMapping("/changePassWord")
	public ModelAndView changePassWord(String id,ModelMap modelMap)
			throws Exception
	{
		modelMap.put("data",userService.getUserById(id));
		return new ModelAndView("system/user/userPass",modelMap);
	}

	@RequestMapping("/detail")
	public ModelAndView detail(String id,ModelMap modelMap)
	{
		modelMap.put("data",xxbUserService.getUserById(id));

		return new ModelAndView("system/user/userDetail",modelMap);
	}
}