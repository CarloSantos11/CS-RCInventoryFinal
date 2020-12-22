package com.devnom.model;

// Should this also extend ItemInventory Item or will the model
// number serve as our sku number/identifier

import java.util.Arrays;

public class Car {
    Frame frame;
    Shell shellType;
    Motor motor;
    Shocks[] shocks;
    Wheel[] wheels;

    public Car(Frame frame, Shell shell, Motor motor, Shocks[] shocks, Wheel[] wheels) {
        this.frame = frame;
        this.shellType = shell;
        this.motor = motor;
        this.shocks = shocks;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "CAR {\n" +
                "\n\tFRAME:\n\t\t" + frame + "," +
                "\n\tSHELL TYPE:\n\t\t" + shellType + "," +
                "\n\tMOTOR:\n\t\t" + motor + "," +
                "\n\tSHOCKS:\n\t\t" + shocks[0] +
                "\n\t\t" + shocks[1] +
                "\n\t\t" + shocks[2]  +
                "\n\t\t" + shocks[3]  +

                "\n\tWHEELS:\n\t\t" + wheels[0] +
                            "\n\t\t" + wheels[1] +
                            "\n\t\t" + wheels[2]  +
                            "\n\t\t" + wheels[3]  +
                "\n}";
    }
}
