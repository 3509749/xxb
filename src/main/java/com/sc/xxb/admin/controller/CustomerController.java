package com.sc.xxb.admin.controller;


import com.sc.xxb.admin.model.Customer;
import com.sc.xxb.admin.service.CustomerService;
import com.sc.xxb.base.mapper.DictMapper;
import com.sc.xxb.base.model.DictTable;
import com.sc.xxb.base.model.FtpProps;
import com.sc.xxb.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private HttpSession session;
    @Autowired
    private DictMapper dictMapper;
    @Autowired
    private FtpProps ftpProps;

    @RequestMapping("/getCustomerData")
    @ResponseBody
    public Map<String, Object> getCustomerData(Customer a, int page, int limit){
        return  CommonUtil.jsonPutPageList(customerService.getCustomerList(a,page,limit));
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(Customer a){
        if(!"".equals(a.getCustomerId()))
            return  customerService.update(a);
        else
            return  customerService.insert(a);
    }

    @RequestMapping("/del")
    @ResponseBody
    public int del(String ids){
        return  customerService.del(ids.split(","));
    }

    @RequestMapping("/customerList")
    public String customerList(ModelMap map){
        return "system/customer/customerList";

    }

    @RequestMapping("/customerAddPage")
    public String customerAddPage(ModelMap map,@RequestParam(value = "id",required = false,defaultValue = "0") String id){
        Customer data = customerService.getCustomerData(new Customer(id));
        map.put("data",data);
        if(!"0".equals(id)){
            data.setCardfullpic1(ftpProps.getNginx()+data.getCardpic1());
            data.setCardfullpic2(ftpProps.getNginx()+data.getCardpic2());
        }
        return "system/customer/customerAdd";
    }

}