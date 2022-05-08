package com.doganilbars.iocsiz_disiz;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named(value = "cdisizCalisan")
@ApplicationScoped
public class Calisan {

    private Patron patron;

    public Calisan() {
        this.patron = new Patron();
    }

    public String getData(String data){
        return patron.surum(data);
    }
}
