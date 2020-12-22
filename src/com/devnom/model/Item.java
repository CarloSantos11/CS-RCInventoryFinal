package com.devnom.model;

import static com.devnom.util.Helper.*;

/**
 * All classes that implement Item must have a unique 9 digit sku number.
 */
public abstract class Item implements IinventoryItem{
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
