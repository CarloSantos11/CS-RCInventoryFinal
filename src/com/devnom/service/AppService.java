package com.devnom.service;

import com.devnom.model.FactoryInventory;
import com.devnom.model.Item;
import com.devnom.model.ItemInventory;

public class AppService {
//    public static void addToInventory

    /**
     * This Static method serves the purpose of adding an Item onto an ItemInventory
     * @param inventory
     * @param item
     */
    public static void addToInventory(ItemInventory inventory, Item item) {
        inventory.getInventoryList().add(item);
    }

    public static void updateFactory(String inventoryType, ItemInventory itemInventory) {
        FactoryInventory.inventoryCollection.put(inventoryType, itemInventory);

    }


    /**
     * POSTPONED: WIP
     * This Static method serves the purpose of removing an item from the specified inventory
     * @param inventory
     * @param item
     */
    public static void removeFromInventory(ItemInventory inventory, Item item) {

        // this logic should iterate through the inventory list and
        // find the specified item if the item is not found this prompts item not found
        inventory.getInventoryList().remove(item);
    }
}
