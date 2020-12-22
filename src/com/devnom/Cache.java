package com.devnom;

import com.devnom.model.*;

public class Cache {
    public static void main(String[] args) {
        ItemInventory<Shell> classicShells = new ItemInventory("Classic Shell");
        ItemInventory<Shell> sportsShells = new ItemInventory("Sports Shell");
        ItemInventory<Shell> suvShells = new ItemInventory("SUV Shell");

        ClassicShell classicShell1 = new ClassicShell();
        ClassicShell classicShell2 = new ClassicShell();
        ClassicShell classicShell3 = new ClassicShell();

        SportsShell sportsShells1 = new SportsShell();
        SportsShell sportsShells2 = new SportsShell();
        SportsShell sportsShells3 = new SportsShell();

        SUVShell suvShell1 = new SUVShell();
        SUVShell suvShell2 = new SUVShell();
        SUVShell suvShell3 = new SUVShell();

        classicShells.addToInventory(classicShell1);
        classicShells.addToInventory(classicShell2);
        classicShells.addToInventory(classicShell3);

        sportsShells.addToInventory(sportsShells1);
        sportsShells.addToInventory(sportsShells2);
        sportsShells.addToInventory(sportsShells3);

        suvShells.addToInventory(suvShell1);
        suvShells.addToInventory(suvShell2);
        suvShells.addToInventory(suvShell3);


        FactoryInventory.updateInventory("classicShells", classicShells);
        FactoryInventory.updateInventory("sportsShell", sportsShells);
        FactoryInventory.updateInventory("suvShell", suvShells);

        System.out.println(FactoryInventory.inventoryCollection.get("suvShell"));
    }
}
