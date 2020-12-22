package com.devnom.model;

public class Frame extends Item {
    private final String skuNumber;

    public Frame() {
        skuNumber = "FRM-" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
