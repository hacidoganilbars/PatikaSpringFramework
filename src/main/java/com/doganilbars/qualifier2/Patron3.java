package com.doganilbars.qualifier2;

@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
            return "Qualifier ENUM IKINCI Patron 3 " + data;
    }
}
