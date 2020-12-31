package com.devnom.model;

/**
 * Inherits from Shell and Item
 */
public class ClassicShell extends Shell {
    private final String skuNumber;

    public ClassicShell() {
        skuNumber = "CL" + super.getSKU();
    }


    @Override
    public String getSKU() {
        return skuNumber;
    }
}
