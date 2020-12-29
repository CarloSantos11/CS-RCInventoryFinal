package com.devnom.view;

public class AppView {
    public static void openingMenu() {
        System.out.println(
                "*************************************** \n" +
                        "       Welcome To The ItemInventory App\n" +
                        "*************************************** \n" +
                        "\t1. Package Model\n" +
                        "\t2. Check Inventory\n" +
                        "\t3. Add Item to Inventory\n" +
                        "\t4. Remove Item From Inventory\n" +

                        "\t\tQ to exit...\n"
        );
    }

    public static void addToInventoryMenu() {
        System.out.println(
                "*************************************** \n" +
                        "       What Item Is Being Added\n" +
                        "*************************************** \n" +
                        "\t1. Frame\n\n" +

                        "\t2. Shells\n" +
                            "\t\t2A. Classic \n" +
                            "\t\t2B. Sport \n" +
                            "\t\t2C. SUV \n\n" +

                        "\t3. Motor\n\n" +
                        "\t4. Shocks\n\n" +

                        "\t5. Wheels\n" +
                            "\t\t5A. Standard \n" +
                            "\t\t5B. Wide \n\n" +

                        "\tQ to exit...\n"
        );
    }
}
