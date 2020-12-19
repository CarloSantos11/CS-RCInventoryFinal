package com.devnom.model;

public class StandardWheel extends Wheel{
    private final String skuNumber;

    public StandardWheel() {
        skuNumber = "ST" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
