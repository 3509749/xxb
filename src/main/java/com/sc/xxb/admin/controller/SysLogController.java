package com.sc.xxb.admin.controller;


import com.sc.xxb.admin.model.SysLog;
import com.sc.xxb.admin.service.SysLogService;
import com.sc.xxb.base.mapper.DictMapper;
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
@RequestMapping("sysLog")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/getSysLogData")
    @ResponseBody
    public Map<String, Object> getSysLogData(SysLog a, int page, int limit){
        return  CommonUtil.jsonPutPageList(sysLogService.getSysLogList(a,page,limit));
    }



    @RequestMapping("/sysLogList")
    public String sysLogList(ModelMap map){
        return "system/sysLog/sysLogList";

    }

    @RequestMapping("/sysLogDetailPage")
    public String sysLogDetailPage(ModelMap map,@RequestParam(value = "id",required = false,defaultValue = "0") String id){
        map.put("data",sysLogService.getSysLogData(new SysLog(id)));
        return "system/sysLog/sysLogDetail";
    }

}