package com.devnom.model;

public class SUVShell extends Shell {
    private final String skuNumber;

    public SUVShell() {
        skuNumber = "SV" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
