package com.sc.xxb.admin.model;
import com.sc.xxb.base.dict.CodeDict;
import com.sc.xxb.base.dict.DictAll;

public class User {
  private String userId;
  private String userName;
  private String userCode;
  private String password;
  private int userType;
  private String userTypeName;
  private String customerId = "";

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


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		customerId = customerId;
	}

	public String getUserTypeName() {
		return DictAll.getItemName("USER_TYPE",this.userType+"");
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", userType=" + userType +
				", userTypeName='" + userTypeName + '\'' +
				", customerId='" + customerId + '\'' +
				'}';
	}
}