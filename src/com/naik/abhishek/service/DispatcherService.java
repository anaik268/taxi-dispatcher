package com.naik.abhishek.service;

import com.naik.abhishek.model.Car;
import com.naik.abhishek.model.Coordinate;

public interface DispatcherService {

    Car dispatchCar(Coordinate location, int passengers);

    void addCar(String plate, int capacity, Coordinate coordinate);

    boolean removeCar(String plate);

}
