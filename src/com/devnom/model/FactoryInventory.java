package com.devnom.model;

import java.util.HashMap;
import java.util.Map;

public  class FactoryInventory {
    public static Map<String, ItemInventory> inventoryCollection = new HashMap<>();

    // I will refactor this logic to be in the service layer
    public static void updateInventory(String inventoryType, ItemInventory itemInventory) {
        inventoryCollection.put(inventoryType, itemInventory);
    }

    public static void print() {
        System.out.println(inventoryCollection);
    }
}
