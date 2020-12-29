package com.devnom.model;

import static com.devnom.util.Helper.*;

/**
 * All classes that implement Item must have a unique 9 digit sku number.
 *
 * Still need to add remote control and batteries
 */
public abstract class Item implements IItem {
    protected final String skuNumber;


    public Item() {
        int skuNum = randomNumberGenerator();
        this.skuNumber = formatNumber(skuNum, 9);
    }

    public String getSKU() {
        return skuNumber;
    }

//    @Override
//    public String toString() {
//        return "ItemInventory Type: " + this.getClass().getSimpleName() +
//                " | SKU: [" + this.getSKU() + "]";
//    }

    @Override
    public String toString() {
        return " SKU#: " + this.getSKU() + "";
    }
}
