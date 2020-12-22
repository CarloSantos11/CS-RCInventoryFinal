package com.devnom.model;

public class Shocks extends Item {
    // Shocks like wheels/tires come in fours
    private final String skuNumber;

    public Shocks() {
        skuNumber = "SHK-" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }

    @Override
    public String toString() {
        return "SKU#: " + getSKU() + "";
    }
}
