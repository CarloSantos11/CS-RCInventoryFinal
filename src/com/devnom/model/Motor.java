package com.devnom.model;

public class Motor extends Item {
    private final String skuNumber;

    public Motor() {
        skuNumber = "MTR-" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
