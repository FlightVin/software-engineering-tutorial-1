// src/com/homesystem/rooms/Kitchen.java
package com.homesystem.rooms;

public class Kitchen extends Room {
    private boolean hasIsland;

    public Kitchen(double roomArea, boolean hasIsland) {
        super("Kitchen", roomArea);
        this.hasIsland = hasIsland;
    }

    public void cook() {
        System.out.println("Cooking in kitchen" + (hasIsland ? " with island" : ""));
    }

    public boolean hasIsland() {
        return hasIsland;
    }
}