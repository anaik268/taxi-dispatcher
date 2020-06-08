package com.naik.abhishek.model;

public class Car {
    private String licensePlate;
    private int capacity;
    private Coordinate location;
    private int passengers;

    public Car(String licensePlate, int capacity, Coordinate location) {
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.location = location;
    }

    public int remainingSeats() {
        return this.capacity - this.passengers;
    }

    public void seatPassengers(int i) {
        passengers += i;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Coordinate getLocation() {
        return location;
    }

    public void setLocation(Coordinate location) {
        this.location = location;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", capacity=" + capacity +
                ", location=" + location +
                ", passengers=" + passengers +
                '}';
    }
}
