// src/com/homesystem/furniture/Sofa.java
package com.homesystem.furniture;

public class Sofa extends Furniture {
    private int numberOfSeats;

    public Sofa(String material, int numberOfSeats) {
        super("Sofa", material);
        this.numberOfSeats = numberOfSeats;
    }

    public void recline() {
        System.out.println("Reclining " + numberOfSeats + "-seater sofa");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}