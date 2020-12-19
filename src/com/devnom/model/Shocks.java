package com.devnom.model;

public class Shocks extends InventoryItem {
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
