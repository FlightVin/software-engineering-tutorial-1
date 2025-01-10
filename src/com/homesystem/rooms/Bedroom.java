// src/com/homesystem/rooms/Bedroom.java
package com.homesystem.rooms;

public class Bedroom extends Room {
    private boolean hasEnsuite;

    public Bedroom(double roomArea, boolean hasEnsuite) {
        super("Bedroom", roomArea);
        this.hasEnsuite = hasEnsuite;
    }

    public void makeBed() {
        System.out.println("Making bed in bedroom");
    }

    public boolean hasEnsuite() {
        return hasEnsuite;
    }
}