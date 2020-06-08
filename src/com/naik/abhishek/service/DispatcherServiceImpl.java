package com.naik.abhishek.service;

import com.naik.abhishek.model.Car;
import com.naik.abhishek.model.Coordinate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DispatcherServiceImpl implements DispatcherService {

    List<Car> fleet = new ArrayList<>();

    @Override
    public Car dispatchCar(Coordinate location, int passengers) {

        Comparator<Car> closestCar = (Car c1, Car c2) -> {
            if (Coordinate.calculateDistance(c1.getLocation(), location) >= Coordinate.calculateDistance(c2.getLocation(), location))
                return 1;
            else
                return -1;
        };
        return fleet.stream()
                .filter(car -> car.remainingSeats() >= passengers)
                .min(closestCar).get();
    }

    @Override
    public void addCar(String plate, int capacity, Coordinate coordinate) {
        Car car = new Car(plate, capacity, coordinate);
        fleet.add(car);
    }

    @Override
    public boolean removeCar(String plate) {
        return fleet.remove(fleet.stream().filter((car) -> car.getLicensePlate().equals(plate)).findFirst().get());
    }
}
