package com.sc.xxb.base.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sc.xxb.admin.model.UUser;
import com.sc.xxb.base.dict.CodeDict;
import com.sc.xxb.base.model.DictTable;
import com.sc.xxb.base.model.FtpProps;
import com.sc.xxb.util.FtpUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.tomcat.jni.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private FtpProps ftpProps;


    @RequestMapping("/getHtmlSelectOptionsByWhereCase")
    @ResponseBody
    public String getHtmlSelectOptionsByWhereCase(DictTable d) {
        return CodeDict.getInstance().createHtmlSelectOptionsByWhereCase(d.getTableName(), d.getCodeField(), d.getNameField(), d.getWhereCase(), d.getParentField(), d.getOrderByField(), d.getSelectValue(), d.getCache());
    }

    @RequestMapping("/createHtmlSelectOptions_CODE_CODE_TEXT_ByWhereCase")
    @ResponseBody
    public String createHtmlSelectOptions_CODE_CODE_TEXT_ByWhereCase(DictTable d) {
        return CodeDict.getInstance().createHtmlSelectOptions_CODE_CODE_TEXT_ByWhereCase(d.getTableName(), d.getCodeField(), d.getNameField(), d.getWhereCase(), d.getParentField(), d.getOrderByField(), d.getSelectValue(), d.getCache());
    }

    @RequestMapping("/createHtmlSelectOptions_TEXT_CODE_TEXT_ByWhereCase")
    @ResponseBody
    public String createHtmlSelectOptions_TEXT_CODE_TEXT_ByWhereCase(DictTable d) {
        return CodeDict.getInstance().createHtmlSelectOptions_TEXT_CODE_TEXT_ByWhereCase(d.getTableName(), d.getCodeField(), d.getNameField(), d.getWhereCase(), d.getParentField(), d.getOrderByField(), d.getSelectValue(), d.getCache());
    }

    @RequestMapping("/getHtmlSelectOptions")
    @ResponseBody
    public String getHtmlSelectOptionsByCache(DictTable d) {
        return CodeDict.getInstance().createHtmlSelectOptions(d.getTableName(), d.getCodeField(), d.getNameField(), d.getParentField(), d.getParentValue(), d.getOrderByField(), d.getSelectValue(), d.getCache());
    }

    @RequestMapping(value = "/upload/{type}", method = RequestMethod.POST)
    @ResponseBody
    public Map upload(MultipartFile file, HttpServletRequest request, @PathVariable String type) {
        Map m = new HashMap();
        String name = file.getOriginalFilename();
        SimpleDateFormat simdf = new SimpleDateFormat("/YYYY/MM/dd");
        Calendar cal = Calendar.getInstance();
        String path = simdf.format(cal.getTime());
        m.put("path", path);
        m.put("name", name);
        try {
            boolean flag = FtpUtil.uploadFile(ftpProps.getHost(), ftpProps.getPort(), ftpProps.getUsername(), ftpProps.getPassword(), "/" + type, path, name, file.getInputStream());
            m.put("flag", flag);
            if (flag) {
                m.put("url", ftpProps.getNginx() + path + "/" + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }


    @RequestMapping(value = "/myupload/{type}", method = RequestMethod.POST)
    @ResponseBody
    public Map myupload(MultipartFile file, HttpServletRequest request, @PathVariable String type) {
        Map m = new HashMap();
        String name = file.getOriginalFilename();
        SimpleDateFormat simdf = new SimpleDateFormat("/YYYY/MM/dd");
        Calendar cal = Calendar.getInstance();
        String path = simdf.format(cal.getTime());
        String[] tmp = name.split("\\.");
        name = cal.getTimeInMillis() + "." + tmp[tmp.length - 1];
        m.put("path", path);
        m.put("name", name);
        try {
            boolean flag = FtpUtil.uploadFile(ftpProps.getHost(), ftpProps.getPort(), ftpProps.getUsername(), ftpProps.getPassword(), "/" + type, path, name, file.getInputStream());
            m.put("flag", flag);
            if (flag) {
                m.put("url", ftpProps.getNginx() + path + "/" + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }

}