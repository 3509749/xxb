package com.sc.xxb.admin.service;

import java.util.List;

import com.sc.xxb.admin.model.UPermission;
import com.sc.xxb.admin.model.URole;
import com.sc.xxb.admin.model.RoleResource;
import com.sc.xxb.admin.model.UUserRole;
import com.sc.xxb.base.model.PageBean;
import com.sc.xxb.base.model.TreeModel;


public interface RoleService {
	public List<URole> getRolesByUserId(String userId);
	public List<URole> getNotRolesByUserId(String userId);
	public List<UPermission> listByUserId(String userId);
	public List<UPermission> listParent(); 
	public List<UPermission> listChild(); 
	
	public PageBean getRoleByPage(URole u, int page, int limit);
	public int insertRole(URole u);
	public int updateRole(URole u);
	public int deleteRoles(String[] ids);
	public URole getRole(URole u);
	public List<TreeModel> getResourceTree(String id);
	public int insertResourceRole(String roleId, String ResourceId);


	public int editUserRoles(List<UUserRole> list, String userId);
}
