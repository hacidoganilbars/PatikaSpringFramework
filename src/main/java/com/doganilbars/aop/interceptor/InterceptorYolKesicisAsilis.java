package com.doganilbars.aop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesicisAsilis {

    @AroundInvoke public Object loglama(InvocationContext invocationContext){
        System.out.println("İlk Hali: "+invocationContext.getMethod().getName());

        //Kullanıcı giriş yapmış mı? Yol Kesici olacak değişkenimiz
        boolean isLogin=false;//true önce login olmalı anlamına gelir

        //Eğer Yol Kesilmezse devam edecek
        //jdbc:session?
        Object isContinue = null;

        if(isLogin){
            System.out.println("Önce login olmalısın!!! ");
            return null;
        }else{
            try{
                isContinue = invocationContext.proceed(); //devam etmesini sağlayan yapı
                System.out.println("Sonraki hali: "+isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }

    }

}
