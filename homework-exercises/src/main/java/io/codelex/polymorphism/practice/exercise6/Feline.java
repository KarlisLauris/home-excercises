package io.codelex.polymorphism.practice.exercise6;

public class Feline extends Mammal {
    public Feline(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        } else {
            System.out.println(getAnimalType() + "s are not eating that type of food!");
        }
    }

    public void makeSound() {
        System.out.println("Feline sound");
    }
}
