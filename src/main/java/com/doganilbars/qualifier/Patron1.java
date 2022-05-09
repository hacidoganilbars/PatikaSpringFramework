package com.doganilbars.qualifier;

import jakarta.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
            return "Default Patron 1 " + data;
    }
}
