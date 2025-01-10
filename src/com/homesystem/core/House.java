// src/com/homesystem/core/House.java
package com.homesystem.core;

import com.homesystem.rooms.Room;
import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private int numberOfRooms;
    private double area;
    private List<Room> rooms;

    public House(String address, double area) {
        this.address = address;
        this.area = area;
        this.rooms = new ArrayList<>();
        this.numberOfRooms = 0;
    }

    public void openDoor() {
        System.out.println("Opening door at " + address);
    }

    public void closeDoor() {
        System.out.println("Closing door at " + address);
    }

    public void addRoom(Room room) {
        rooms.add(room);
        numberOfRooms++;
        System.out.println("Added " + room.getRoomType() + " to house at " + address);
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }
}
