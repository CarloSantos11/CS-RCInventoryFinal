package com.devnom.service;

import com.devnom.model.*;
import com.devnom.view.AppView;

import static com.devnom.util.Helper.getUserInput;

public class AppService {
//    public static void addToInventory
    public static void addItem(String itemType) {
        Item itemInstance = createInventoryObject(itemType);
        addToInventory(FactoryInventory.inventoryCollection.get(itemType),itemInstance);
        FactoryInventory.print();
    }

    // Gives the ability to add multiple items
    public static void addItems(String itemType) {
        AppView.promptForCount();
        int amount = (Integer.parseInt(getUserInput()));

        for(int i = 0; i < amount; i++) {
            Item itemInstance = createInventoryObject(itemType);
            addToInventory(FactoryInventory.inventoryCollection.get("Frame"),itemInstance);
        }

        FactoryInventory.print();
    }

    public static Item createInventoryObject(String inventoryObject) {
        switch (inventoryObject) {
            case "Frame":
                 return new Frame();
            case "Classic Shell":
                return new ClassicShell();
            case "SUV Shell":
                return new SUVShell();
//            case "Sports Shell":
//                break;
//            case "Motor":
//                break;
//            case "Shocks":
//                break;
//            case "Wide Wheels":
//                break;
        }
        return null;
    }
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
