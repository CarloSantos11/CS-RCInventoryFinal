package com.devnom.model;

/**
 * Interface: Each ItemInventory will have an SKU number (Stock Keeping Unit).
 *
 * SKU numbers are used to keep track of the movement of inventory
 */
public interface IinventoryItem {

    // https://www.investopedia.com/terms/s/stock-keeping-unit-sku.asp#:~:text=A%20stock%2Dkeeping%20unit%20(SKU,track%20the%20movement%20of%20inventory.

    /**
     * This ensures that anything the implements IinventoryItem
     *
     * @return A String representation of an SKU number
     */
    public String getSKU();
}
