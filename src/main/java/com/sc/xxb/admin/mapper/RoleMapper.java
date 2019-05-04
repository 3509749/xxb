package com.sc.xxb.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sc.xxb.admin.model.RoleResource;
import com.sc.xxb.admin.model.UPermission;
import com.sc.xxb.admin.model.URole;
 
@Mapper
public interface RoleMapper {
	public List<URole> getUserRole(String userId);
	public List<URole> getNotUserRole(String userId);
	public int insertUserRoles(List list);

	public List<UPermission> listByUserId(String userId);
	public List<UPermission> listParent(); 
	public List<UPermission> listChild(); 
	
	public List<URole> getRole(URole u);
	public int getRoleCount(URole u);
	public int insertRole(URole u);
	public int updateRole(URole u);
	public int deleteRoles(String[] ids);
	public int deleteUserRole(String[] ids);
	public List<UPermission> getResource(String id);
	public List<UPermission> getAllResource();
	
	
	public int insertResourceRole(RoleResource r);
	public int deleteResourceRole(String[] ids);
	
	
	
}
