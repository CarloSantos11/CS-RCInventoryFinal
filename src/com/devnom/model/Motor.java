package com.devnom.model;

public class Motor extends InventoryItem {
    private final String skuNumber;

    public Motor() {
        skuNumber = "MTR-" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
