package io.codelex.polymorphism.practice.exercise1;

public class Golf implements FastCars {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed += 12;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

}
