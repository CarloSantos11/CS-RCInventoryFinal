package com.devnom.model;

import java.util.HashMap;
import java.util.Map;

public  class FactoryInventory {
    static Map<String, ItemInventory> inventoryCollection;

    public FactoryInventory(){
        inventoryCollection = new HashMap<>();
    }

    public static void updateInventory(String inventoryType, InventoryItem item) {
//        inventoryCollection.put(inventoryType, item);

    }


}
