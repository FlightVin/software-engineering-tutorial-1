// src/com/homesystem/Main.java
package com.homesystem;

import com.homesystem.core.House;
import com.homesystem.furniture.Chair;
import com.homesystem.furniture.Sofa;
import com.homesystem.rooms.Bedroom;
import com.homesystem.rooms.Kitchen;
import com.homesystem.rooms.Room;

/**
 * Main class demonstrating the usage of the Home Management System
 */
public class Main {
    public static void main(String[] args) {
        // Create a new house
        House myHouse = new House("123 Java Street", 2000.0);
        System.out.println("Created new house at " + myHouse.getAddress());

        // Add rooms to the house
        Bedroom masterBedroom = new Bedroom(300.0, true);
        Kitchen kitchen = new Kitchen(250.0, true);
        myHouse.addRoom(masterBedroom);
        myHouse.addRoom(kitchen);

        // Add furniture to the bedroom
        Chair bedroomChair = new Chair("Wood", true);
        masterBedroom.addFurniture(bedroomChair);
        masterBedroom.makeBed();
        
        // Add furniture to the kitchen
        Chair kitchenChair1 = new Chair("Metal", false);
        Chair kitchenChair2 = new Chair("Metal", false);
        kitchen.addFurniture(kitchenChair1);
        kitchen.addFurniture(kitchenChair2);

        // Demonstrate some functionality
        myHouse.openDoor();
        kitchen.turnOnLights();
        kitchen.cook();
        
        // Remove and move furniture
        kitchen.removeFurniture(kitchenChair1);
        bedroomChair.move();
        bedroomChair.clean();

        // Print house statistics
        System.out.println("\nHouse Statistics:");
        System.out.println("Address: " + myHouse.getAddress());
        System.out.println("Total Area: " + myHouse.getArea() + " sq ft");
        System.out.println("Number of Rooms: " + myHouse.getNumberOfRooms());

        // Turn off lights and close door
        kitchen.turnOffLights();
        masterBedroom.turnOffLights();
        myHouse.closeDoor();
    }
}