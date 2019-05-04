package com.sc.xxb.admin.controller;

import com.sc.xxb.admin.model.UPermission;
import com.sc.xxb.admin.model.URole;
import com.sc.xxb.admin.model.User;
import com.sc.xxb.admin.service.MenuService;
import com.sc.xxb.admin.service.RoleService;
import com.sc.xxb.base.model.TreeModel;
import com.sc.xxb.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("menu")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/getMenuData")
	@ResponseBody 
	public Map<String, Object> getMenuData(UPermission u, int page, int limit){
		return  CommonUtil.jsonPutPageList(menuService.getMenuByPage(u,page,limit));
	}
	@RequestMapping("/add")
	@ResponseBody
	public int addMenu(UPermission u){
			return menuService.insert(u);
	}

	@RequestMapping("/update")
	@ResponseBody
	public int updateMenu(UPermission u){
		return menuService.update(u);
	}

	@RequestMapping("/del")
	@ResponseBody
	public int del(String ids){
		return menuService.delete(ids.split(","));
	}

	@RequestMapping("/menulist")
	public String userlist(ModelMap map){
    return "system/menu/menulist";
    }

	@RequestMapping("/menuAddPage")
	public String menuAddPage(ModelMap map,@RequestParam(value = "id",required = false,defaultValue = "0") String id){
		map.put("data", menuService.getMenuData(new UPermission(id)));
		return "system/menu/menuAdd";
	}

}