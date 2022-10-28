package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private String batteryType;

    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String batteryType) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return getBatteryType().equals(laptop.getBatteryType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBatteryType());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", batteryType='" + batteryType + '\'' +

                '}';
    }
}
