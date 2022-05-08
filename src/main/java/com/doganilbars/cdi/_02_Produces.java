package com.doganilbars.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named(value = "producestuto")
@ApplicationScoped
public class _02_Produces {

    @Produces //Üretiyor
    public List<String> getList(){
        List<String> liste = new ArrayList();
        liste.add("Html5");
        liste.add("Css3");
        liste.add("Js");
        liste.add("React");
        liste.add("Angular");
        return liste;
    }
}
