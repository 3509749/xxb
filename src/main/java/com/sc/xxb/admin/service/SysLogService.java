package com.sc.xxb.admin.service;


import com.sc.xxb.admin.model.SysLog;
import com.sc.xxb.base.model.PageBean;

public interface SysLogService {
	public PageBean getSysLogList(SysLog a, int page, int limit);
    public  SysLog getSysLogData(SysLog a);
    public int logInsert(SysLog a);
}
