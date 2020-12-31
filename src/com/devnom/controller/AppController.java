package com.devnom.controller;

import com.devnom.service.AppService;
import com.devnom.view.AppView;
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
        String userInput = "";

        while (!userInput.equalsIgnoreCase("Q")) {
            AppView.openingMenu();
            inventoryActions(getUserInput());
        }
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
                addToInventory();
                break;
            case "4":
//                buildCar();
                choice = "4";
                break;
            case "5":
//              loadUpTestInventoryData();
                break;
            case "Q":
            case "q":
                System.exit(0);
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
        addInventoryTypeAction(option);
    }

    private static void addInventoryTypeAction(String choice) {
        // Must catch the case fo 2a and 2A
        switch (choice) {
            case "1":
                AppService.addItem("Frame");
                break;
            case "2A":
                // Add Classic Shell to inventory
                AppService.addItem("Classic Shell");
                break;
            case"2B":
                // Add Classic Shell to inventory
                AppService.addItem("Sport Shell");
                break;
            case"2C":
                // Add Classic Shell to inventory
                AppService.addItem("SUV Shell");
                break;
            case"3":
                // Add Motor to Inventory
                AppService.addItem("Motor");
                break;
            case"4":
                // Add Shocks to Inventory
                AppService.addItem("Shocks");
                break;
            case"5A":
                // Add Standard Wheels
                AppService.addItem("Standard Wheels");
                break;
            case"5B":
                // Add Wide Wheels
                AppService.addItem("Wide Wheels");
                break;
            case"Q":
                // Should execute the ability to quit
                break;
        }
    }

    // This should be refactored to the service
//    private static
}
