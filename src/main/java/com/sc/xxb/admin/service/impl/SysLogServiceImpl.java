package com.sc.xxb.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.sc.xxb.admin.mapper.SysLogMapper;
import com.sc.xxb.admin.model.SysLog;
import com.sc.xxb.admin.service.SysLogService;
import com.sc.xxb.base.model.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements SysLogService {


    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public PageBean getSysLogList(SysLog model, int page, int limit) {
        PageHelper.startPage(page, limit);
        List list = sysLogMapper.getSysLogList(model);
        int countNums = sysLogMapper.getCount(model);
        PageBean<SysLog> pageData = new PageBean(page, limit, countNums);
        pageData.setItems(list);
        pageData.setPageSize(countNums);
        return pageData;
    }

    @Override
    public SysLog getSysLogData(SysLog a) {
        if("0".equals(a.getId()))
            return new SysLog();
        return sysLogMapper.getSysLogList(a).get(0);
    }

    @Override
    public int logInsert(SysLog a) {
        return sysLogMapper.logInsert(a);
    }

}
