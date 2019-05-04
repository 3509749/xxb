package com.sc.xxb.business.yw.service;

import com.sc.xxb.base.model.PageBean;
import com.sc.xxb.business.yw.model.XxbUser;
import com.sc.xxb.business.yw.model.XxbUserExample;

import java.util.List;


public interface XxbUserService {

    public PageBean selectByExample(XxbUser model, int page, int limit);
    public  XxbUser getUserById(String id);
    public int insert(XxbUser model);
    public int update(XxbUser model);
    public int countByExample(XxbUserExample x);
}
