package io.codelex.polymorphism.practice.exercise1;

public class Ford implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 15;
    }

    public void slowDown() {
        currentSpeed += 15;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
