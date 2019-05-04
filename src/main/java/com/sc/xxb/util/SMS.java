package com.sc.xxb.util;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class SMS {

    public static void main(String[] args) {
        try {
            new SMS().sendSMS("15828175008","Java Http方式短信调试已经成功!!!!!","");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /*
     * 发送方法
     */
    public static int sendSMS(String Mobile,String Content,String send_time) throws MalformedURLException, UnsupportedEncodingException {
        URL url = null;
        String CorpID="CDJS005171";//账户名
        String Pwd="605171@";//密码
        String send_content=URLEncoder.encode(Content.replaceAll("<br/>", " "), "GBK");//发送内容
        url = new URL("https://sdk2.028lk.com/sdk2/BatchSend2.aspx?CorpID="+CorpID+"&Pwd="+Pwd+"&Mobile="+Mobile+"&Content="+send_content+"&Cell=&SendTime="+send_time);
        BufferedReader in = null;
        int inputLine = 0;
        try {
            System.out.println("开始发送短信手机号码为 ："+Mobile);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            inputLine = new Integer(in.readLine()).intValue();
        } catch (Exception e) {
            System.out.println("网络异常,发送短信失败！");
            inputLine=-2;
        }
        System.out.println("结束发送短信返回值：  "+inputLine);
        return inputLine;
    }
}
