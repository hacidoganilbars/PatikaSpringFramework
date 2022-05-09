package com.doganilbars.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "alternativeCdi")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

   /* public Calisan() {
        this.patron = new Patron();
    }*/

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
