package com.company;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Room room1 = new Room(4, 1, 2, 1);
        Room room2 = new Room(6, 2, 5, 2);
        Room room3 = new Room(8, 3, 9, 4);

        ArrayList<Room> list = new ArrayList<>();
        list.add(room1);
        list.add(room2);
        list.add(room3);

        Building building1 = new Building(list, 5, 3, false);//to get this is an odd building change nbrOfFloors to 2
        building1.numberOfLamps();
    }
}
