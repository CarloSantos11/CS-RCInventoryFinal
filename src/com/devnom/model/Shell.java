package com.devnom.model;

public abstract class Shell extends InventoryItem {
    private final String skuNumber;

    public Shell() {
        skuNumber = "SHL-" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
