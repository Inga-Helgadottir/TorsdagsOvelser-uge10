package com.company;

public class Main {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Inga", 25);
        Car car1 = new Car("make", "model", 2000, "bodyStyle", driver1);
        System.out.println(car1.toString());
        System.out.println(driver1.toString());
    }
}
