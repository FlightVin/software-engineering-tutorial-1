// src/com/homesystem/furniture/Furniture.java
package com.homesystem.furniture;

public abstract class Furniture {
    protected String type;
    protected String material;

    public Furniture(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public void move() {
        System.out.println("Moving " + type + " furniture");
    }

    public void clean() {
        System.out.println("Cleaning " + type + " made of " + material);
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}