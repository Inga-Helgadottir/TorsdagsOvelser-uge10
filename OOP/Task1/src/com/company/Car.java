package com.company;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public Car(String make, String model, int year, String bodyStyle, Driver driver) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Make: " + make + ". Model: " + model+ ". Year: ("+ year + "), BodyStyle: "+bodyStyle;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
