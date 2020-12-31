package com.devnom.model;

import java.util.ArrayList;

/**
 * This
 * @param <T> - The Type of the inventory list. ex: car, frame, shells, motors, etc.
 */
public class ItemInventory<T extends Item> {
    private final String inventoryType;
    protected ArrayList<T> inventoryList;

    /**
     * Constructor
     * @param inventoryType the type of this inventory list
     */
    public ItemInventory(String inventoryType) {
        this.inventoryType = inventoryType;
        inventoryList = new ArrayList<>();
    }

    public ArrayList<T> getInventoryList() {
        return this.inventoryList;
    }

    public String getType() {
        return this.inventoryType;
    }

    public int getCount() {
        return this.inventoryList.size();
    }

    // Consider Using string builder here
    @Override
    public String toString() {
        System.out.println(getType() + ": Total Count(" + getCount() + ")");
        for (T item : inventoryList) {
            System.out.println(item);
        }
        System.out.println();
        return "";
    }
}
