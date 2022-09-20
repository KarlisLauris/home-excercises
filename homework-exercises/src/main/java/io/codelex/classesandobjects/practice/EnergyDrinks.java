package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        int purchasedEnergyDrinks = (int) calculateEnergyDrinkers(NUMBERED_SURVEYED);
        System.out.println("Approximately " + purchasedEnergyDrinks + " bought at least one energy drink");
        int prefersCitrus = (int) calculatePreferCitris(purchasedEnergyDrinks);
        System.out.println(prefersCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed* PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        return calculateEnergyDrinkers(numberSurveyed)* PREFER_CITRUS_DRINKS;
    }
}
