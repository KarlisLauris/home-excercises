package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class VariablesAndNames {
    public static void main(String[] args) {
        DecimalFormat formatting = new DecimalFormat("0.00");

        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double seatsInACar, carpoolCapacity,averagePassengersPerCar;

        cars = 100; //cars
        seatsInACar = 4; //seats in a car
        drivers = 30; // drivers
        passengers = 90; // passengers
        carsNotDriven = cars - drivers; // free cars
        carsDriven = drivers; // cars driven at the moment
        carpoolCapacity = carsDriven * seatsInACar; // carpool capacity
        averagePassengersPerCar = (double)passengers / carsDriven; // average passengers per car

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + formatting.format(carpoolCapacity) + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + formatting.format( averagePassengersPerCar) + " in each car.");
    }

}