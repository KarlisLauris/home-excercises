package io.codelex.classesandobjects;

import io.codelex.classesandobjects.Classes.FuelGauge;
import io.codelex.classesandobjects.Classes.Odometer;

public class Exercise3 {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer();
        while (fuelGauge.getLiters() < 70) {
            fuelGauge.addLiters(1);
            System.out.println("Current Fuel: " + fuelGauge.getLiters());
        }
        System.out.println("Fuel tank is full");
        while (fuelGauge.getLiters() > 0) {
            odometer.addKilometers(1);
            if (odometer.getKilometers() % 10 == 0) {
                fuelGauge.removeLiters(1);
            }
        }
        System.out.println("Fuel is empty, kilometers: " + odometer.getKilometers());
    }
}

