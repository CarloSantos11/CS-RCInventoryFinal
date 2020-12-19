package com.devnom.model;

public abstract class Wheel extends InventoryItem {
    private final String skuNumber;

    public Wheel() {
        skuNumber = "WL-" + super.getSKU();
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
