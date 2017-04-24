package com.pei.support;

import com.pei.pojo.UsermanagementCustomuser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebContext{
    private String sid;
    private int loginId;
    private UsermanagementCustomuser usermanagementCustomuser;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public WebContext(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
    }

    public String getSid(){
        return sid;
    }

    public void setSid(String sid){
        this.sid = sid;
    }

    public int getLoginId(){
        return loginId;
    }

    public void setLoginId(int loginId){
        this.loginId = loginId;
    }

    public UsermanagementCustomuser getUser(){
        return usermanagementCustomuser;
    }

    public void setUser(UsermanagementCustomuser usermanagementCustomuser){
        this.usermanagementCustomuser = usermanagementCustomuser;
    }

    public boolean isLogon(){
        return usermanagementCustomuser != null;
    }

    public HttpServletRequest getRequest(){
        return request;
    }

    public HttpServletResponse getResponse(){
        return response;
    }

}
