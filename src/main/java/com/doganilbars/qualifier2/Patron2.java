package com.doganilbars.qualifier2;

@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
            return "Qualifier Enum BIRINCI Patron 2 " + data;
    }
}
