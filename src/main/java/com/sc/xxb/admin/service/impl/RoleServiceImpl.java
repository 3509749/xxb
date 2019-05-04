package com.sc.xxb.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sc.xxb.admin.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sc.xxb.admin.mapper.RoleMapper;
import com.sc.xxb.admin.service.RoleService;
import com.sc.xxb.base.model.PageBean;
import com.sc.xxb.base.model.TreeModel;

import com.github.pagehelper.PageHelper;

@Service
@Transactional
// 此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class RoleServiceImpl  implements RoleService {
	@Autowired
    private RoleMapper roleMapper;
	public List<URole>  getRolesByUserId(String userId){
		return roleMapper.getUserRole(userId);
	}
	public List<URole>  getNotRolesByUserId(String userId){
		return roleMapper.getNotUserRole(userId);
	}
	public List<UPermission> listByUserId(String userId){
		List<UPermission> list  = roleMapper.listByUserId(userId);
		List<UPermission>  parentList = new ArrayList<>();
		for(UPermission temp : list){
			temp.setChilds(new ArrayList<>());
			if(null == temp.getParentId())
				parentList.add(temp);
		}
		for(UPermission temp : list){
			if(null != temp.getParentId()){
				for(UPermission temp2 : parentList){
					if(temp2.getMenuId().equals(temp.getParentId()))
						temp2.getChilds().add(temp);
				}
			}
		}
		return parentList;
	}
	@Override
	public List<UPermission> listParent() {
		// TODO Auto-generated method stub
		return roleMapper.listParent();
	}
	@Override
	public List<UPermission> listChild() {
		// TODO Auto-generated method stub
		return roleMapper.listChild();
	} 
	
	public PageBean getRoleByPage(URole u, int page, int limit) {
		PageHelper.startPage(page, limit);
		List list = roleMapper.getRole(u);
		int countNums = roleMapper.getRoleCount(u);
		PageBean<User> pageData = new PageBean<>(page, limit, countNums);
		pageData.setItems(list);
		return pageData;
	}


	@Override
	public int insertRole(URole u) {
		int r=0;
		try {
			r=roleMapper.insertRole(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public int deleteRoles(String[] ids) {
		int r=0;
		try {
			roleMapper.deleteResourceRole(ids);
			r= roleMapper.deleteRoles(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public URole getRole(URole u) {
		if("".equals(u.getRoleId()))
			return new URole();
		else
			return (URole) roleMapper.getRole(u).get(0);
	}
	@Override
	public int updateRole(URole u) {
		int r=0;
		try {
			r=roleMapper.updateRole(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public List<TreeModel> getResourceTree(String id) {
		List<UPermission> list = roleMapper.getAllResource();
		List<UPermission> currList = roleMapper.getResource(id);
		List<TreeModel> treeList = new ArrayList<>();
		for(UPermission temp : list){
			TreeModel t = new TreeModel();
			t.setId(temp.getMenuId());
			t.setpId(temp.getParentId());
			t.setName(temp.getMenuName());
			treeList.add(t);
		}
		for(TreeModel temp : treeList){
			for(UPermission u : currList){
				if(u.getMenuId().equals(temp.getId()))
					temp.setChecked(true);
			}
		}
		return treeList; 
	}
	@Override
	public int insertResourceRole(String roleId,String resourceId) {
		int row=0;
		roleMapper.deleteResourceRole(roleId.split(","));
		try {
			for(String resId : resourceId.split(",")){
				RoleResource r = new RoleResource(roleId,resId);
				roleMapper.insertResourceRole(r);
				row++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return row;
	}

	public int editUserRoles(List<UUserRole> userRoles,String user_id) {
		// TODO Auto-generated method stub
		int r=0;

		try {
			roleMapper.deleteUserRole(new String[]{user_id});
			if(userRoles!=null&&userRoles.size()>0){
				roleMapper.insertUserRoles(userRoles);
			}
			r=2000;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
}
