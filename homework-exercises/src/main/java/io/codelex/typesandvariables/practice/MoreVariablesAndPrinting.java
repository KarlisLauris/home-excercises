package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String Name, Eyes, Teeth, Hair;
        Name = "Zed A. Shaw";
        int Age = 35;
        double Height = 74*2.54;
        double Weight = 180*0.453592;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + Height + " centimeters  tall.");
        System.out.println("He's " + Weight + " kilos heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");
        System.out.println("If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + Height + Weight) + ".");
    }
}