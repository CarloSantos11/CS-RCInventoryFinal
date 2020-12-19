package com.devnom.model;

public class SportsShell extends Shell {
    private final String skuNumber;

    public SportsShell() {
        skuNumber = "SP" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
