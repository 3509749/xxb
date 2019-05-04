package com.sc.xxb.admin.model;

import java.util.Date;

public class SysLog {
	private String id = "";
	private String operType = "";
	private String serId = "";
	private String macAddress = "";
	private String mainStr = "";
	private String userName = "";
	private Date operdateTime;
	private String operResult = "";
	private String operName = "";
	private String notes = "";
	private String errorMessage = "";
	private String userId = "";
	private String detailStr = "";
	private String num = "1";
	private String ip="";

	public SysLog() {
	}

	public SysLog(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType;
	}

	public String getSerId() {
		return serId;
	}

	public void setSerId(String serId) {
		this.serId = serId;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMainStr() {
		return mainStr;
	}

	public void setMainStr(String mainStr) {
		this.mainStr = mainStr;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getOperdateTime() {
		return operdateTime;
	}

	public void setOperdateTime(Date operdateTime) {
		this.operdateTime = operdateTime;
	}

	public String getOperResult() {
		return operResult;
	}

	public void setOperResult(String operResult) {
		this.operResult = operResult;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDetailStr() {
		return detailStr.trim();
	}

	public void setDetailStr(String detailStr) {
		this.detailStr = detailStr;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "SysLog{" +
				"id='" + id + '\'' +
				", operType='" + operType + '\'' +
				", serId='" + serId + '\'' +
				", macAddress='" + macAddress + '\'' +
				", mainStr='" + mainStr + '\'' +
				", userName='" + userName + '\'' +
				", operdateTime=" + operdateTime +
				", operResult='" + operResult + '\'' +
				", operName='" + operName + '\'' +
				", notes='" + notes + '\'' +
				", errorMessage='" + errorMessage + '\'' +
				", userId='" + userId + '\'' +
				", detailStr='" + detailStr + '\'' +
				", num='" + num + '\'' +
				", ip='" + ip + '\'' +
				'}';
	}
}