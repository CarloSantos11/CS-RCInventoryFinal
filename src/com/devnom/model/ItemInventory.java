package com.devnom.model;

import java.util.ArrayList;

/**
 * This
 * @param <T> - The Type of the inventory list. ex: car, frame, shells, motors, etc.
 */
public class ItemInventory<T extends  InventoryItem> {
    private final String inventoryType;
    private ArrayList<T> inventoryList;

    /**
     * Constructor
     * @param inventoryType the type of this inventory list
     */
    public ItemInventory(String inventoryType) {
        this.inventoryType = inventoryType;
        inventoryList = new ArrayList<>();
    }

    // this may belong more-so in the service
    public void addToInventory(T item) {
        inventoryList.add(item);
    }

    public String getType() {
        return this.inventoryType;
    }

    public int getCount() {
        return this.inventoryList.size();
    }
    @Override
    public String toString() {
        System.out.println(getType() + ": Total Count(" + getCount() + ")");
        for (T item : inventoryList) {
            System.out.println(item);
        }
        return "";
    }
}
