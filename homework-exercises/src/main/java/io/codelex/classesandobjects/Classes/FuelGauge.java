package io.codelex.classesandobjects.Classes;

public class FuelGauge {
    private double liters;

    public FuelGauge() {
        this.liters = 0;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public void addLiters(double liters) {
        this.liters += liters;
        if(this.liters > 70) {
            this.liters = 70;
        }
    }

    public void removeLiters(double liters) {
        this.liters -= liters;
    }
}
