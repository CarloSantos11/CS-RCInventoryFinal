package com.devnom.controller;

import com.devnom.model.Item;
import com.devnom.view.AppView;

import static com.devnom.service.AppService.*;
import static com.devnom.util.Helper.*;

/**
 * This decides what action we will be directed to
 */
public class AppController {

    /**
     * This method will start up our inventory application
     * displaying our menu
     */
    public static void runApplication(){
        AppView.openingMenu();
        inventoryActions(getUserInput());
    }

    private static String inventoryActions(String choice) {
        switch (choice){
            case "1":
                break;
            case "2":
//                checkInventory();
                choice = "2";
                break;
            case "3":
//                 // This should give us the ability to add something to the inventory
                 // CURRENT CHECK
                addToInventory();
                break;
            case "4":
//                buildCar();
                choice = "4";
                break;
            case "Q":
                choice="Q";
                break;
            default:
//                InventoryUi.invalidInputPrompt("Choice");
        }
        return choice;
    }

    /**
     * This directs the flow of adding something to the inventory.
     */
    private static void addToInventory(){
        AppView.addToInventoryMenu();
        String option = getUserInput();
        addToInventoryAction(option);
    }

    private static void addToInventoryAction(String choice) {
        // Must catch the case fo 2a and 2A
        switch (choice) {
            case "1":
                // Add Frame to inventory
//                addItem(inventory, Item item);
                break;
            case "2A":
                // Add Classic Shell to inventory
                break;
            case"2B":
                // Add Classic Shell to inventory
                break;
            case"2C":
                // Add Classic Shell to inventory
                break;
            case"3":
                // Add Motor to Inventory
                break;
            case"4":
                // Add Shocks to Inventory
                break;
            case"5A":
                // Add Standard Wheels
                break;
            case"5B":
                // Add Wide Wheels
                break;
            case"Q":
                // Should execute the ability to quit
                break;
        }
    }

    // This should be refactored to the service
//    private static
}
