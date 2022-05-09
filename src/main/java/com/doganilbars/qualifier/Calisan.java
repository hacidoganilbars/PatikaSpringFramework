package com.doganilbars.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    //Default
    // @Inject
    //private PatronInterface patronInterface;
    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
