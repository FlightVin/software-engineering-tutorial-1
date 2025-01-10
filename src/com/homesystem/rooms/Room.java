// src/com/homesystem/rooms/Room.java
package com.homesystem.rooms;

import com.homesystem.furniture.Furniture;
import com.homesystem.interfaces.ILightControl;
import java.util.ArrayList;
import java.util.List;

public class Room implements ILightControl {
    private String roomType;
    private double roomArea;
    private List<Furniture> furniture;

    public Room(String roomType, double roomArea) {
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.furniture = new ArrayList<>();
    }

    public void addFurniture(Furniture item) {
        furniture.add(item);
        System.out.println("Added " + item.getType() + " to " + roomType);
    }

    public void removeFurniture(Furniture item) {
        furniture.remove(item);
        System.out.println("Removed " + item.getType() + " from " + roomType);
    }

    @Override
    public void turnOnLights() {
        System.out.println("Turning on lights in " + roomType);
    }

    @Override
    public void turnOffLights() {
        System.out.println("Turning off lights in " + roomType);
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public List<Furniture> getFurniture() {
        return new ArrayList<>(furniture);
    }
}