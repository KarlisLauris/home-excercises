package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(getAnimalType() + "s are not eating that type of food!");
        }
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    public void makeSound() {
        System.out.println("Mammal sound");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]", getAnimalType(), getAnimalName(), df.format(getAnimalWeight()), this.livingRegion, getFoodEaten());
    }
}
