package io.codelex.classesandobjects.Classes;

public class Car {
    private  double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }
    public double calculateConsumption() {
        return (endKilometers - startKilometers) / liters/100;
    }
    public boolean gasHog() {
        return calculateConsumption() > 15;
    }
    public boolean economyCar() {
        return calculateConsumption() < 5;
    }

    public void fillUp(double milage, double liters) {
        this.liters += liters;
        this.endKilometers = milage;
    }
}
