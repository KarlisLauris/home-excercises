package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly{
    private double totalSales;
    private double comissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comissionRate = comissionRate;
    }
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        totalSales = 0;
        return super.pay() + totalSales * comissionRate;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTotal sales: " + totalSales;
    }

}
