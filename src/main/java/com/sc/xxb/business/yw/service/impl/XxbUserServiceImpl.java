package com.sc.xxb.business.yw.service.impl;

import com.github.pagehelper.PageHelper;
import com.sc.xxb.base.model.PageBean;
import com.sc.xxb.business.yw.mapper.XxbUserMapper;
import com.sc.xxb.business.yw.model.XxbUser;
import com.sc.xxb.business.yw.model.XxbUserExample;
import com.sc.xxb.business.yw.service.XxbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class XxbUserServiceImpl implements XxbUserService {
    @Autowired
    private XxbUserMapper mapper;


    public PageBean selectByExample(XxbUser model,int page,int limit) {
        PageHelper.startPage(page, limit);
        XxbUserExample example = new XxbUserExample();
        XxbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserTypeEqualTo(model.getUserType());
        if(null != model.getUserName() && !"".equals(model.getUserName()))
        criteria.andUserNameLike(model.getUserName());
        int countNums = mapper.countByExample(example);
        List list = mapper.selectByExample(example);
        PageBean<XxbUser> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(list);
        return pageData;
    }

    @Override
    public XxbUser getUserById(String id) {
        XxbUserExample example = new XxbUserExample();
        example.createCriteria().andUserIdEqualTo(id);
        if(!id.equals(""))
            return mapper.selectByExample(example).get(0);
        else
            return new XxbUser();
    }




    @Override
    public int insert(XxbUser model) {
        return mapper.insertSelective(model);
    }

    @Override
    public int update(XxbUser model) {
        XxbUserExample example = new XxbUserExample();
        example.createCriteria().andUserIdEqualTo(model.getUserId());
        return mapper.updateByExampleSelective(model,example);
    }

    @Override
    public int countByExample(XxbUserExample x) {
        return mapper.countByExample(x);
    }

}
