package com.sc.xxb.admin.service;


import com.sc.xxb.admin.model.Customer;
import com.sc.xxb.base.model.PageBean;

public interface CustomerService {
	public PageBean getCustomerList(Customer a, int page, int limit);
    public  Customer getCustomerData(Customer a);
    public int insert(Customer a);
    public int update(Customer a);
    public int del(String[] ids);
}
