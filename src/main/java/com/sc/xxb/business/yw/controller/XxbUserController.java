package com.sc.xxb.business.yw.controller;

import com.sc.xxb.admin.model.UUser;
import com.sc.xxb.admin.model.UUserRole;
import com.sc.xxb.base.mapper.DictMapper;
import com.sc.xxb.base.model.DictItem;
import com.sc.xxb.base.model.DictTable;
import com.sc.xxb.base.model.FtpProps;
import com.sc.xxb.business.yw.model.XxbUser;
import com.sc.xxb.business.yw.model.XxbUserExample;
import com.sc.xxb.business.yw.service.XxbUserService;
import com.sc.xxb.util.CommonUtil;
import com.sc.xxb.util.SMS;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("xxbUser")
public class XxbUserController {

    @Autowired
    private XxbUserService service;
    @Autowired
    private DictMapper dictMapper;
    @Autowired
    private FtpProps ftpProps;

    private static Map phoneMap = new HashMap();

    @RequestMapping("/getXxbUserData")
    @ResponseBody
    public Map<String, Object> getXxbUserData(XxbUser model, int page, int limit) {
        return CommonUtil.jsonPutPageList(service.selectByExample(model, page, limit));
    }



    @RequestMapping("/add2")
    @ResponseBody
    public int add2(XxbUser model) {
//        try {
//            if (!phoneMap.get(model.getPhone()).equals(model.getCheckSMS())) return 3;
//        }catch (Exception e){
//            return 3;
//        }
        model.setUserType(new Short("2"));
        XxbUserExample example = new XxbUserExample();
        example.createCriteria().andUserNameEqualTo(model.getUserName());
        int count = service.countByExample(example);
        if(count != 0) return 2;
        service.insert(model);
        UsernamePasswordToken token = new UsernamePasswordToken(model.getUserName(), model.getPassword());
        SecurityUtils.getSubject().login(token);
        return 1;
    }

    @RequestMapping("/add3")
    @ResponseBody
    public int add3(XxbUser model) {
        UUser user = (UUser)SecurityUtils.getSubject().getPrincipal();
        model.setUserId(user.getUserId());
        return service.update(model);
    }


    @RequestMapping("/add")
    @ResponseBody
    public int add(XxbUser model) {
        if(!"".equals(model.getUserId()) && null != model.getUserId())
            return service.update(model);
        else
            return service.insert(model);
    }

    @RequestMapping("/check")
    @ResponseBody
    public int check(String id) {
        XxbUser model = new XxbUser();
        model.setUserId(id);
        return service.update(model);
    }

    @RequestMapping("/sendMsg")
    @ResponseBody
    public void sendMsg(ModelMap map,String phone){
        int random = (int) Math.floor(10000*Math.random());
        try {
            SMS.sendSMS(phone,"亲爱的客户：您好！您的学信宝手机验证码为"+random+",有效期为30分钟。请勿将验证码告知他人并确定该申请为您本人操作。","");
            phoneMap.put(phone,random+"");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/checkUserName")
    @ResponseBody
    public boolean checkUserName(@RequestParam(value = "userName",required = false,defaultValue = "")String userName){
        List<DictItem> list= dictMapper.getOtherTable(new DictTable("XXB_USER", "USER_NAME", "USER_ID","", "",""));
        for(DictItem temp:list){
            if(temp.getCode() != null && temp.getCode().equals(userName))
                return false;
        }
        return true;
    }

    @RequestMapping("/checkStudentCardId")
    @ResponseBody
    public boolean checkStudentCardId(@RequestParam(value = "studentCardId",required = false,defaultValue = "")String studentCardId){
        List<DictItem> list= dictMapper.getOtherTable(new DictTable("XXB_USER", "STUDENT_CARD_ID", "USER_ID","", "",""));
        for(DictItem temp:list){
            if(temp.getCode() != null && temp.getCode().equals(studentCardId))
                return false;
        }
        return true;
    }

    @RequestMapping("/checkPhone")
    @ResponseBody
    public boolean checkPhone(@RequestParam(value = "phone",required = false,defaultValue = "")String phone){
        List<DictItem> list= dictMapper.getOtherTable(new DictTable("XXB_USER", "PHONE", "USER_ID","", "",""));
        for(DictItem temp:list){
            if(temp.getCode() != null && temp.getCode().equals(phone))
                return false;
        }
        return true;
    }

    @RequestMapping("/changePassword")
    @ResponseBody
    public boolean changePassword(String userName,String oldPassword,String password,String userId){
        XxbUserExample example = new XxbUserExample();
        XxbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andPasswordEqualTo(oldPassword);
        int i = service.countByExample(example);
        if(i == 0)
            return false;
        else{
            XxbUser xxbUser = new XxbUser(userId);
            xxbUser.setPassword(password);
            service.update(xxbUser);
            return true;
        }

    }


    @RequestMapping("/userAdd")
    public String userAdd(ModelMap map,@RequestParam(value = "id",required = false,defaultValue = "") String id,String userType){
        map.put("userType",dictMapper.getDict(new DictTable("USER_TYPE")));
        XxbUser data = service.getUserById(id);
        map.put("data",data);
        map.put("userType",userType);
        return "system/user/userAdd";
    }

    @RequestMapping("/xy")
    public String xy(ModelMap map){
        return "system/user/xy";
    }

    @RequestMapping("/authentication")
    public String authentication(ModelMap map){
        return "system/user/authentication";
    }

    @RequestMapping("/userInfo")
    public String userInfo(ModelMap map,@RequestParam(value = "id",required = false,defaultValue = "") String id){
        map.put("userType",dictMapper.getDict(new DictTable("USER_TYPE")));
        XxbUser data = service.getUserById(id);
        map.put("data",data);
        return "system/userCheck/userInfo";
    }


}
