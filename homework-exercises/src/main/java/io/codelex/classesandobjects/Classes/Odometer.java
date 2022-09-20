package io.codelex.classesandobjects.Classes;

public class Odometer {
    private double kilometers;
    public Odometer() {
        this.kilometers = 0;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public void addKilometers(double kilometers) {
        this.kilometers += kilometers;
        if(this.kilometers > 999999) {
            this.kilometers = 0;
        }
    }

    public void removeKilometers(double kilometers) {
        this.kilometers -= kilometers;
    }
}
