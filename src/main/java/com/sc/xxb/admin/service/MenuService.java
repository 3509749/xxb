package com.sc.xxb.admin.service;

 
import com.sc.xxb.admin.model.UPermission;
import com.sc.xxb.admin.model.UUser;
import com.sc.xxb.admin.model.User;
import com.sc.xxb.base.model.PageBean;

import java.util.List;

public interface MenuService {
	public PageBean getMenuByPage(UPermission u, int page, int limit);
	public UPermission getMenuData(UPermission u);
	public int insert(UPermission u);
	public int update(UPermission u);
	public int delete(String[] ids);
}
