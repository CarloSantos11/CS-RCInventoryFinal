package com.devnom.util;

import java.util.Random;

public final class Helper {
    public static Random randoTest = new Random();

    /**
     * Generates a random 9 digit number
     *
     * @return a five digit integer value
     */
    public static final int randomNumberGenerator(){
        return randoTest.nextInt(1000000000) + 1;
    }

    /**
     * Formats convertNum parameter to ensure that there are 'n' number of placeValues
     *
     *
     * @param convertNum
     * @param placeValues
     * @return A string value of a formatted number
     */
    public static final String formatNumber(int convertNum, int placeValues) {
        String stringFormatter = "%0" + placeValues + "d";
        return String.format(stringFormatter ,convertNum);
    }
}
