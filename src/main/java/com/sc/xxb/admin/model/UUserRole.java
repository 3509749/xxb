package com.sc.xxb.admin.model;
import java.io.Serializable;



/**
 * @Title: UUserRole.java 
 * @Package com.xm.shiro.admin.entity
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author bamboo  <a href=
 *         "mailto:zjcjava@163.com?subject=hello,bamboo&body=Dear Bamboo:%0d%0a描述你的问题："
 *         Bamboo</a>   
 * @date 2017-5-10 0:13:30
 * @version V1.0   
 */
public class UUserRole  implements Serializable {
 	private static final long serialVersionUID =1493049839167L;
	private String userId;//用户ID
	private String roleId;//角色ID


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	//generate toString method
	@Override
	public String toString (){
		return "UUserRole[uid="+userId
		+",rid="+roleId+"]";
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
