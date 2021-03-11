package com.company;

public class Room {
    private int walls;
    private int nbrOfDoors;
    private int nbrOfLamps;
    private int nbrOfWindows;

    public Room(int walls, int nbrOfDoors, int nbrOfLamps, int nbrOfWindows) {
        this.walls = walls;
        this.nbrOfDoors = nbrOfDoors;
        this.nbrOfLamps = nbrOfLamps;
        this.nbrOfWindows = nbrOfWindows;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + walls +
                ", nbrOfDoors=" + nbrOfDoors +
                ", nbrOfLamps=" + nbrOfLamps +
                ", nbrOfWindows=" + nbrOfWindows +
                '}';
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getNbrOfDoors() {
        return nbrOfDoors;
    }

    public void setNbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
    }

    public int getNbrOfLamps() {
        return nbrOfLamps;
    }

    public void setNbrOfLamps(int nbrOfLamps) {
        this.nbrOfLamps = nbrOfLamps;
    }

    public int getNbrOfWindows() {
        return nbrOfWindows;
    }

    public void setNbrOfWindows(int nbrOfWindows) {
        this.nbrOfWindows = nbrOfWindows;
    }

}
