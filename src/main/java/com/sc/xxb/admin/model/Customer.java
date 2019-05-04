package com.sc.xxb.admin.model;
import com.sc.xxb.base.dict.DictAll;

import java.util.Date;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerType;
	private String cardId="";
	private String phone="";
	private String address="";
	private String cardpic1;
	private String cardfullpic1;
	private String cardpic2;
	private String cardfullpic2;
	private String bankName="";
	private String bankCardId="";
	private String bankCardName="";
	private Date updateTime;

	public Customer() {
	}

	public Customer(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardpic1() {
		return cardpic1;
	}

	public void setCardpic1(String cardpic1) {
		this.cardpic1 = cardpic1;
	}

	public String getCardpic2() {
		return cardpic2;
	}

	public void setCardpic2(String cardpic2) {
		this.cardpic2 = cardpic2;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getBankCardName() {
		return bankCardName;
	}

	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCardfullpic1() {
		return cardfullpic1;
	}

	public void setCardfullpic1(String cardfullpic1) {
		this.cardfullpic1 = cardfullpic1;
	}

	public String getCardfullpic2() {
		return cardfullpic2;
	}

	public void setCardfullpic2(String cardfullpic2) {
		this.cardfullpic2 = cardfullpic2;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"customerId='" + customerId + '\'' +
				", customerName='" + customerName + '\'' +
				", customerType='" + customerType + '\'' +
				", cardId='" + cardId + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", cardpic1='" + cardpic1 + '\'' +
				", cardfullpic1='" + cardfullpic1 + '\'' +
				", cardpic2='" + cardpic2 + '\'' +
				", cardfullpic2='" + cardfullpic2 + '\'' +
				", bankName='" + bankName + '\'' +
				", bankCardId='" + bankCardId + '\'' +
				", bankCardName='" + bankCardName + '\'' +
				", updateTime=" + updateTime +
				'}';
	}
}