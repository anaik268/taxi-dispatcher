package com.naik.abhishek.model;

public class Person {
    private String name;
    private Car currentCar;
    private Coordinate location;

    public Person(String name, Coordinate location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCurrentCar() {
        return currentCar;
    }

    public void setCurrentCar(Car currentCar) {
        this.currentCar = currentCar;
    }

    public Coordinate getLocation() {
        return location;
    }

    public void setLocation(Coordinate location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", currentCar=" + currentCar +
                ", location=" + location +
                '}';
    }
}
