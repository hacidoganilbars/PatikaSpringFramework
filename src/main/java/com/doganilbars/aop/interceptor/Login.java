package com.doganilbars.aop.interceptor;

@InterceptorYolKesici
public class Login {

    public String isLoginMethod(String data){
        return "isLoginMethod: "+data;
    }
}
