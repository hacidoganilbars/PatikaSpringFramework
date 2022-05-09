package com.doganilbars.iocli_dili;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "iocliCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
