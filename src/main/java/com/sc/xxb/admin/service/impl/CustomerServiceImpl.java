package com.sc.xxb.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.sc.xxb.admin.mapper.CustomerMapper;
import com.sc.xxb.admin.model.Customer;
import com.sc.xxb.admin.service.CustomerService;
import com.sc.xxb.base.model.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public PageBean getCustomerList(Customer model, int page, int limit) {
        PageHelper.startPage(page, limit);
        List list = customerMapper.getCustomerList(model);
        int countNums = customerMapper.getCount(model);
        PageBean<Customer> pageData = new PageBean(page, limit, countNums);
        pageData.setItems(list);
        pageData.setPageSize(countNums);
        return pageData;
    }

    @Override
    public Customer getCustomerData(Customer a) {
        if("0".equals(a.getCustomerId()))
            return new Customer();
        return customerMapper.getCustomerList(a).get(0);
    }

    @Override
    public int insert(Customer a) {
        return customerMapper.insert(a);
    }

    public int update(Customer a) {
        return customerMapper.update(a);
    }

    public int del(String[] ids) {
        return customerMapper.delete(ids);
    }
}
