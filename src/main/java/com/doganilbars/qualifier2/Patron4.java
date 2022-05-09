package com.doganilbars.qualifier2;

@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data) {
            return "Qualifier ENUM UCUNCU Patron 2 " + data;
    }
}
