package com.doganilbars.qualifier2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier2Cdi")
@ApplicationScoped
public class Calisan {

    //Default
    // @Inject
    //private PatronInterface patronInterface;

    /* @Inject
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    private PatronInterface patronInterface;
    */

    @Inject
    @QualifierMultiple2(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
