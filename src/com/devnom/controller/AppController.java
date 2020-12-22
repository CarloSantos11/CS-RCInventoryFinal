package com.devnom.controller;

public class AppController {
    private static String inventoryActions(String choice) {
        switch (choice){
            case "1":
                choice = "1";
//                addToInventory(); // CURRENT CHECK
                break;
            case "2":
//                checkInventory();
                choice = "2";
                break;
            case "3":
//                removeItems();
                choice = "3";
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
}
