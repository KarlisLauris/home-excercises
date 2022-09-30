package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    //1. adding cars to the list,
    //2. removing a car from the list,
    //3. returning a list of all cars,
    //4. returning cars with a V12 engine,
    //5. returning cars produced before 1999,
    //6. returning the most expensive car,
    //7. returning the cheapest car,
    //8. returning the car with at least 3 manufacturers,
    //9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
    //10. checking if a specific car is on the list,
    //11. returning a list of cars manufactured by a specific manufacturer,
    //12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
    //    =,! = from the given.

    private List<Car> cars = new ArrayList<>();

    public CarService() {
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsWithV12Engine() {
        List<Car> carsWithV12Engine = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                carsWithV12Engine.add(car);
            }
        }
        return carsWithV12Engine;
    }

    public List<Car> getCarsProducedBefore1999() {
        List<Car> carsProducedBefore1999 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture() < 1999) {
                carsProducedBefore1999.add(car);
            }
        }
        return carsProducedBefore1999;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar() {
        Car cheapestCar = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() < cheapestCar.getPrice()) {
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        List<Car> carsSortedByPrice = new ArrayList<>(cars);
        if (ascending) {
            carsSortedByPrice.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
        } else {
            carsSortedByPrice.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        }
        return carsSortedByPrice;
    }

    public boolean isCarOnTheList(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturer().equals(manufacturer)) {
                carsByManufacturer.add(car);
            }
        }
        return carsByManufacturer;
    }

    public List<Car> getCarsByManufacturerYearOfEstablishment(Manufacturer manufacturer) {
List<Car> carsByManufacturerYearOfEstablishment = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturer().getYearOfEstablishment() == manufacturer.getYearOfEstablishment()) {
                carsByManufacturerYearOfEstablishment.add(car);
            }
        }
        return carsByManufacturerYearOfEstablishment;
    }

}
