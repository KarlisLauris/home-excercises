package io.codelex.oop.cars;

import java.util.Objects;

public class Car {
    //2) Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all necessary methods and constructor parameters. Implement the hashcode() and equals() methods.
    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private Manufacturer manufacturer;
    private EngineType engineType;

    public Car(String name, String model, int price, int yearOfManufacture, Manufacturer manufacturer, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer = manufacturer;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturer=" + manufacturer +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getPrice() == car.getPrice() && getYearOfManufacture() == car.getYearOfManufacture() && getName().equals(car.getName()) && getModel().equals(car.getModel()) && getManufacturer().equals(car.getManufacturer()) && getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturer, engineType);
    }

}
