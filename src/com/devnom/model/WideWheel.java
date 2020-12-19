package com.devnom.model;

public class WideWheel extends Wheel {
    private final String skuNumber;

    public WideWheel() {
        skuNumber = "WD" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }

}
