package com.sc.xxb.admin.model;
import java.io.Serializable;



/**
 * @Title: URole.java 
 * @Package com.xm.shiro.admin.entity
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author bamboo  <a href=
 *         "mailto:zjcjava@163.com?subject=hello,bamboo&body=Dear Bamboo:%0d%0a描述你的问题："
 *         Bamboo</a>   
 * @date 2017-5-10 0:12:26
 * @version V1.0   
 */
public class URole  implements Serializable {
	 /** serialVersionUID. */
 	private static final long serialVersionUID =1493049839167L;
 	
	  private String roleId;
	  private String roleName;
	  private String notes;
	  private int status;

	public URole() {
	}

	public URole(String roleId) {
		this.roleId = roleId;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "URole{" +
				"roleId='" + roleId + '\'' +
				", roleName='" + roleName + '\'' +
				", notes='" + notes + '\'' +
				", status=" + status +
				'}';
	}
}
