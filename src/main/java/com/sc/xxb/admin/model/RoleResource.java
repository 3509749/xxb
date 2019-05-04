package com.sc.xxb.admin.model;

public class RoleResource {
	private String id;
	private String roleId;
	private String menuId;
	
	public RoleResource(){
		super();
	}
	public RoleResource(String rId,String resId){
		this.roleId = rId;
		this.menuId = resId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "RoleResource{" +
				"id='" + id + '\'' +
				", roleId='" + roleId + '\'' +
				", menuId='" + menuId + '\'' +
				'}';
	}
}
