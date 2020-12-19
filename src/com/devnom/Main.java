package com.devnom;

import com.devnom.model.*;

public class Main {

    public static void main(String[] args) {
	// create a frame
        Frame frame = new Frame();
        Shell ferrari = new SportsShell();
        Motor motor = new Motor();

        Shocks shock1 = new Shocks();
        Shocks shock2 = new Shocks();
        Shocks shock3 = new Shocks();
        Shocks shock4 = new Shocks();

        Wheel wheel1 = new StandardWheel();
        Wheel wheel2 = new StandardWheel();
        Wheel wheel3 = new StandardWheel();
        Wheel wheel4 = new StandardWheel();

        Wheel[] wheels = {wheel1,wheel2, wheel3, wheel4};
        Shocks[] shocks = {shock1, shock2, shock3, shock4};

        Car dopeCar = new Car(frame,ferrari,motor,shocks,wheels);

        System.out.println(dopeCar);
    }
}
