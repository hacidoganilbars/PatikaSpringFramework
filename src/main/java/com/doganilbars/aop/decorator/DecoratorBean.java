package com.doganilbars.aop.decorator;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    IEv iEv;

    public String decoratorBeanMethod(String data){
        return iEv.boyama(data);
    }
}
