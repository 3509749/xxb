package com.sc.xxb.admin.mapper;

import com.sc.xxb.admin.model.Customer;
import com.sc.xxb.admin.model.SysLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysLogMapper {
    public  List<SysLog> getSysLogList(SysLog a);
    public int getCount(SysLog a);
    public int logInsert(SysLog a);

}
