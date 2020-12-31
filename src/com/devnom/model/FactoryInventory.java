package com.devnom.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public  class FactoryInventory {
    public static Map<String, ItemInventory> inventoryCollection = new LinkedHashMap<String, ItemInventory>(){{
        put("Frame", new ItemInventory<Frame>("Frame"));
        put("Classic Shell", new ItemInventory<ClassicShell>("Classic Shell"));
        put("SUV Shell", new ItemInventory<SUVShell>("SUV Shell"));
        put("Sports Shell", new ItemInventory<SportsShell>("Sports Shell"));
        put("Motor", new ItemInventory<Motor>("Motor"));
        put("Shocks", new ItemInventory<Shocks>("Shocks"));
        put("Standard Wheels", new ItemInventory<StandardWheel>("Standard Wheels"));
        put("Wide Wheels", new ItemInventory<WideWheel>("Wide Wheels"));
    }};

    // I will refactor this logic to be in the service layer
    // this adds a kind of item inventory as the value for the key
    // so it should work for both removing and updating
    // MIGHT BE UNNECESSARY
    public static void updateInventory(String inventoryType, ItemInventory itemInventory) {
        inventoryCollection.put(inventoryType, itemInventory);
    }


    // this is the temporary print method. we will see how we print in the future
    public static void print() {
        inventoryCollection.forEach((k,v) -> System.out.print(v));
    }
}
