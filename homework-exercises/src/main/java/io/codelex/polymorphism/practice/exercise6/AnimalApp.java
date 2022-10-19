package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        String input = scanner.nextLine().trim();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            Animal animal = null;
            while (animal == null) {
                String animalType = tokens[0];
                String animalName = tokens[1];
                Double animalWeight = Double.parseDouble(tokens[2]);
                String livingRegion = tokens[3];
                String breed = null;
                if (tokens.length == 5) {
                    breed = tokens[4];
                }
                animal = switch (animalType) {
                    case "Cat" -> new Cat(animalName, animalType, animalWeight, livingRegion, breed);
                    case "Tiger" -> new Tiger(animalName, animalType, animalWeight, livingRegion);
                    case "Zebra" -> new Zebra(animalName, animalType, animalWeight, livingRegion);
                    case "Mouse" -> new Mouse(animalName, animalType, animalWeight, livingRegion);
                    default -> null;
                };
                if (animal == null) {
                    System.out.println("Invalid animal type, try again");
                }
            }

            animal.makeSound();

            Food food = null;
            while (food == null) {
                int foodQuantity;
                String foodType;
                input = scanner.nextLine().trim();
                tokens = input.split("\\s+");
                foodType = tokens[0];
                foodQuantity = Integer.parseInt(tokens[1]);
                food = switch (foodType) {
                    case "Vegetable" -> new Vegetable(foodQuantity);
                    case "Meat" -> new Meat(foodQuantity);
                    default -> null;
                };
                if (food == null) {
                    System.out.println("Invalid food type, try again");
                }
            }

            animal.eat(food);
            animals.add(animal);
            System.out.println(animal);
            input = scanner.nextLine();
        }
        System.out.println(animals.stream().map(Animal::toString).collect(Collectors.joining(", ")));
    }
}
