package com.sc.xxb.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.github.pagehelper.PageInfo;
import com.sc.xxb.base.model.PageBean;



public class CommonUtil {
	
	
	public static Map<String, Object> jsonPutPageList(PageBean page){
    	Map<String, Object> jsonMap2 = new HashMap<String, Object>();
    	jsonMap2.put("count", page.getTotalNum());
    	jsonMap2.put("data", page.getItems());
    	jsonMap2.put("totalPage", page.getTotalPage());
    	jsonMap2.put("msg", "");
    	jsonMap2.put("code", 0);
    	return jsonMap2;
    }

	public static Map<String, Object> jsonPutPageList(PageInfo page){
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("totalPage", page.getPages());
		jsonMap.put("totalNum", page.getTotal());
		jsonMap.put("list", page.getList());
		jsonMap.put("msg", "");
		jsonMap.put("code", 0);
		return jsonMap;
	}

	public static boolean isOSLinux() {
		Properties prop = System.getProperties();
		String os = prop.getProperty("os.name");
		if (os != null && os.toLowerCase().indexOf("linux") > -1) {
			return true;
		} else {
			return false;
		}
	}
	
}
