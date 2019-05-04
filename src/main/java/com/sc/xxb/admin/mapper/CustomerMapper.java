package com.sc.xxb.admin.mapper;

import com.sc.xxb.admin.model.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    public  List<Customer> getCustomerList(Customer a);
    public int getCount(Customer a);
    public int insert(Customer a);
    public int update(Customer a);
    public int delete(String[] ids);

}
