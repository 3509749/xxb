package com.sc.xxb.admin.aop;


import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface logInfo {
    String  value();
}
