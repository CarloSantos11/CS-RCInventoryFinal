package com.devnom.model;

import static com.devnom.util.Helper.formatNumber;

public class Frame extends InventoryItem {
    private final String skuNumber;

    public Frame() {
        skuNumber = "FRM-" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
