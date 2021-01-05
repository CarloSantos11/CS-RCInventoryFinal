package com.devnom.controller;

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
                AddController.toInventory();
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
                break;
//                InventoryUi.invalidInputPrompt("Choice");
        }
        return choice;
    }
}
