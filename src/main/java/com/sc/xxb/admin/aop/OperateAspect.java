package com.sc.xxb.admin.aop;


import com.sc.xxb.SpringUtil;
import com.sc.xxb.admin.model.SysLog;
import com.sc.xxb.admin.model.UUser;
import com.sc.xxb.admin.service.SysLogService;
import com.sc.xxb.base.sevice.DictService;
import javassist.*;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.MethodInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  //声明组件
@Aspect //  声明切面
@ComponentScan  //组件自动扫描
public class  OperateAspect {

    private Logger logger = LoggerFactory.getLogger(OperateAspect.class);


    @AfterReturning(returning="rvt",pointcut="execution(public * com.sc.xxb..service.impl..*.del*(..)) or execution(public * com.sc.xxb..service.impl..*.update*(..)) or execution(public * com.sc.xxb..service.impl..*.insert*(..))")
    public void after(JoinPoint joinPoint,Object rvt){
        this.printMethodParams(joinPoint,rvt);
    }

    public void printMethodParams(JoinPoint point,Object rvt){
        if(point == null){
            return;
        }
        System.out.println("123");
        String class_name = point.getTarget().getClass().getName();
        String method_name = point.getSignature().getName();
        Object[] method_args = point.getArgs();
        String[] paramNames = null;
        try {
            paramNames = getFieldsName(class_name, method_name);
            logParam(paramNames,method_args);

        } catch (Exception e) {
            e.printStackTrace();
        }
        SysLog log = new SysLog();
        UUser user = (UUser) SecurityUtils.getSubject().getPrincipal();
        if( null != user){
            log.setUserId(user.getUserId());
            log.setUserName(user.getUserName());}
        log.setOperName(class_name);
        log.setOperType(method_name);
        log.setMainStr(StringUtils.join(paramNames,","));
        log.setOperResult(rvt.toString());
        if(method_args.length != 0){
            if(method_args[0] instanceof String[])
                log.setDetailStr(StringUtils.join((String[])method_args[0],","));
            else if(method_args[0] instanceof List){
                String detail = "";
                for(Object temp:(List)method_args[0]){
                    detail += temp.toString().trim()+",";
                }
                log.setDetailStr(detail);
            }
            else if(method_args[0] instanceof Object)
                log.setDetailStr(method_args[0].toString().trim());

        }
        ((SysLogService) SpringUtil.getBean(SysLogService.class)).logInsert(log);
        //重新定义日志
        logger = LoggerFactory.getLogger(point.getTarget().getClass());
        logger.info("class_name = {}",class_name);
        logger.info("method_name = {}",method_name);


    }


    private String[] getFieldsName(String class_name, String method_name) throws Exception {
        Class<?> clazz = Class.forName(class_name);
        String clazz_name = clazz.getName();
        ClassPool pool = ClassPool.getDefault();
        ClassClassPath classPath = new ClassClassPath(clazz);
        pool.insertClassPath(classPath);

        CtClass ctClass = pool.get(clazz_name);
        CtMethod ctMethod = ctClass.getDeclaredMethod(method_name);
        MethodInfo methodInfo = ctMethod.getMethodInfo();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);
        if(attr == null){
            return null;
        }
        String[] paramsArgsName = new String[ctMethod.getParameterTypes().length];
        int pos = Modifier.isStatic(ctMethod.getModifiers()) ? 0 : 1;
        for (int i=0;i<paramsArgsName.length;i++){
            paramsArgsName[i] = attr.variableName(i + pos);
        }
        return paramsArgsName;
    }

    private boolean isPrimite(Class<?> clazz){
        if (clazz.isPrimitive() || clazz == String.class){
            return true;
        }else {
            return false;
        }
    }

    private void logParam(String[] paramsArgsName,Object[] paramsArgsValue){
        if( paramsArgsName.length == 0|| paramsArgsValue.length == 0){
            logger.info("该方法没有参数");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        for (int i=0;i<paramsArgsName.length;i++){
            //参数名
            String name = paramsArgsName[i];
            //参数值
            Object value = paramsArgsValue[i];
            buffer.append(name +" = ");
            if(isPrimite(value.getClass())){
                buffer.append(value + "  ,");
            }else {
                buffer.append(value.toString() + "  ,");
            }
        }
        logger.info(buffer.toString());
    }
}
