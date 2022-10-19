package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

}
