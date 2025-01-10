// src/com/homesystem/furniture/Chair.java
package com.homesystem.furniture;

public class Chair extends Furniture {
    private boolean hasArmrests;

    public Chair(String material, boolean hasArmrests) {
        super("Chair", material);
        this.hasArmrests = hasArmrests;
    }

    public void adjustHeight() {
        System.out.println("Adjusting chair height");
    }

    public boolean hasArmrests() {
        return hasArmrests;
    }
}