package com.sc.xxb.admin.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sc.xxb.base.dict.CodeDict;



/**
 * @Title: UUser.java 
 * @Package com.xm.shiro.admin.entity
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author bamboo  <a href=
 *         "mailto:zjcjava@163.com?subject=hello,bamboo&body=Dear Bamboo:%0d%0a描述你的问题："
 *         Bamboo</a>   
 * @date 2017-5-10 0:13:08
 * @version V1.0   
 */
public class UUser  implements Serializable {
	 /** serialVersionUID. */
 	private static final long serialVersionUID =1493049839167L;

	private String userId;
	private String userName;
	private String userCode;
	private String password;
	private int userType;
	private String roleId;
	private String status;
	private String customerId;
    private List<String> roleStrlist;
    private List<String> perminsStrlist;


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		customerId = customerId;
	}

	public List<String> getRoleStrlist() {
		return roleStrlist;
	}

	public void setRoleStrlist(List<String> roleStrlist) {
		this.roleStrlist = roleStrlist;
	}

	public List<String> getPerminsStrlist() {
		return perminsStrlist;
	}

	public void setPerminsStrlist(List<String> perminsStrlist) {
		this.perminsStrlist = perminsStrlist;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UUser{" +
				"userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", userType=" + userType +
				", roleId='" + roleId + '\'' +
				", customerId='" + customerId + '\'' +
				", roleStrlist=" + roleStrlist +
				", perminsStrlist=" + perminsStrlist +
				'}';
	}
}
