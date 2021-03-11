package com.company;

import java.util.ArrayList;

public class Building {
    private final ArrayList<Room> rooms;
    private int nbrOfBathrooms;
    private int nbrOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int nbrOfBathrooms, int nbrOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.nbrOfBathrooms = nbrOfBathrooms;
        this.nbrOfFloors = nbrOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public int numberOfLamps() {
        int lampCount = 0;
        for (Room room : rooms) {
            lampCount += room.getNbrOfLamps();
            if(this.nbrOfFloors > rooms.size()){
                System.out.println("This is an odd building");
            }
        }
        System.out.println("There are " + lampCount + " lamps in the building");
        return lampCount;
    }

    public int getNbrOfBathrooms() {
        return nbrOfBathrooms;
    }

    public void setNbrOfBathrooms(int nbrOfBathrooms) {
        this.nbrOfBathrooms = nbrOfBathrooms;
    }

    public int getNbrOfFloors() {
        return nbrOfFloors;
    }

    public void setNbrOfFloors(int nbrOfFloors) {
        this.nbrOfFloors = nbrOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public void setOfficeBuilding(boolean officeBuilding) {
        isOfficeBuilding = officeBuilding;
    }
}
