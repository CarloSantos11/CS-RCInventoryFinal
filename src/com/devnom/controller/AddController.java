package com.devnom.controller;

import com.devnom.service.AppService;
import com.devnom.view.AppView;

import static com.devnom.util.Helper.getUserInput;

public class AddController {
    /**
     * This directs the flow of adding something to the inventory.
     * Along with addInventoryTypeAction();
     */
    protected static void toInventory(){
        AppView.addToInventoryMenu();
        String option = getUserInput();
        addInventoryTypeAction(option);
    }

    private static void addInventoryTypeAction(String choice) {
        // Must catch the case fo 2a and 2A
        switch (choice) {
            case "1":
                AppService.addItems("Frame");
                break;
            case "2A":
                // Add Classic Shell to inventory
                AppService.addItems("Classic Shell");
                break;
            case "2B":
                // Add Classic Shell to inventory
                AppService.addItems("Sport Shell");
                break;
            case "2C":
                // Add Classic Shell to inventory
                AppService.addItems("SUV Shell");
                break;
            case "3":
                // Add Motor to Inventory
                AppService.addItems("Motor");
                break;
            case "4":
                // Add Shocks to Inventory
                AppService.addItems("Shocks");
                break;
            case "5A":
                // Add Standard Wheels
                AppService.addItems("Standard Wheels");
                break;
            case "5B":
                // Add Wide Wheels
                AppService.addItems("Wide Wheels");
                break;
            case "Q":
                // Should execute the ability to quit
                break;
            default:
                System.out.println( choice + "  is not a valid option");
                break;
        }
    }
}
