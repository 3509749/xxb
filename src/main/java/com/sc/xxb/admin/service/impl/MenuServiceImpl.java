package com.sc.xxb.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.sc.xxb.admin.mapper.MenuMapper;
import com.sc.xxb.admin.mapper.RoleMapper;
import com.sc.xxb.admin.model.RoleResource;
import com.sc.xxb.admin.model.UPermission;
import com.sc.xxb.admin.model.URole;
import com.sc.xxb.admin.model.User;
import com.sc.xxb.admin.service.MenuService;
import com.sc.xxb.admin.service.RoleService;
import com.sc.xxb.base.model.PageBean;
import com.sc.xxb.base.model.TreeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
// 此处不再进行创建SqlSession和提交事务，都已交由spring去管理
public class MenuServiceImpl implements MenuService {
	@Autowired
    private MenuMapper menuMapper;

	public PageBean getMenuByPage(UPermission u, int page, int limit) {
		PageHelper.startPage(page, limit);
		List list = menuMapper.getMenuList(u);
		int countNums = menuMapper.getMenuCount(u);
		PageBean<UPermission> pageData = new PageBean<>(page, limit, countNums);
		pageData.setItems(list);
		return pageData;
	}

	@Override
	public int insert(UPermission u) {
		return menuMapper.insert(u);
	}

	@Override
	public int update(UPermission u) {
		return menuMapper.update(u);
	}

	@Override
	public int delete(String[] ids) {
		return menuMapper.delete(ids);
	}

	@Override
	public UPermission getMenuData(UPermission u) {
		if("0".equals(u.getMenuId()))
			return new UPermission();
		UPermission u1 = menuMapper.getMenuList(u).get(0);
		return u1;
	}
}
