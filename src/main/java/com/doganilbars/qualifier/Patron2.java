package com.doganilbars.qualifier;

@QualifierMultiple
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
            return "Qualifier Patron 2 " + data;
    }
}
