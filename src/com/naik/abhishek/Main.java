package com.naik.abhishek;

import com.naik.abhishek.model.Car;
import com.naik.abhishek.model.Coordinate;
import com.naik.abhishek.model.Person;
import com.naik.abhishek.service.DispatcherService;
import com.naik.abhishek.service.DispatcherServiceImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DispatcherService dispatcherService = new DispatcherServiceImpl();

        List<Person> people = Arrays.asList(
                new Person("Abhishek Naik", new Coordinate(75, 100)),
                new Person("John Smith", new Coordinate(50, 75)),
                new Person("Richard Hendrix", new Coordinate(25, 10)),
                new Person("Tom Hanks", new Coordinate(20, 40)),
                new Person("Bob Wilson", new Coordinate(65, 95))
        );

        dispatcherService.addCar("z123sd", 4, new Coordinate(45, 50));
        dispatcherService.addCar("hf5fsg", 4, new Coordinate(10, 20));
        dispatcherService.addCar("g5dqrf", 6, new Coordinate(45, 35));
        dispatcherService.addCar("ag22sd", 6, new Coordinate(0, 0));
        dispatcherService.addCar("kj23df", 4, new Coordinate(15, 0));

        //person 1 requested a car for 5 people
        requestCar(dispatcherService, people.get(0), 5);
        //person 2 requested a car for 3 people
        requestCar(dispatcherService, people.get(1), 3);
        //person 3 requested a car for 4 people
        requestCar(dispatcherService, people.get(2), 4);
        //person 4 requested a car for 2 people
        requestCar(dispatcherService, people.get(3), 2);
        //person 5 requests a car for 1 person
        requestCar(dispatcherService, people.get(4), 1);

        people.stream().forEach(System.out::println);


    }

    private static void requestCar(DispatcherService dispatcherService, Person person, int i) {
        Car car = dispatcherService.dispatchCar(person.getLocation(), i);
        car.seatPassengers(i);
        car.setLocation(person.getLocation());
        person.setCurrentCar(car);
    }
}
