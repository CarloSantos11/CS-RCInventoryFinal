package com.devnom.model;

import java.util.HashMap;
import java.util.Map;

public  class FactoryInventory {
    public static Map<String, ItemInventory> inventoryCollection = new HashMap<>();

    // I will refactor this logic to be in the service layer
    // this adds a kind of item inventory as the value for the key
    // so it should work for both removing and updating
    public static void updateInventory(String inventoryType, ItemInventory itemInventory) {
        inventoryCollection.put(inventoryType, itemInventory);
    }


    // this is the temporary print method. we will see how we print in the future
    public static void print() {
        System.out.println(inventoryCollection);
    }
}
