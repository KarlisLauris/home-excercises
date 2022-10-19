package io.codelex.arithmetic;

import java.util.Scanner;

public class Exercise9 {
    public static String analyzeBmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Optimal weight";
        } else{
            return "Overweight";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Will you be using metric system or imperial system?");
        String system = sc.nextLine();
        System.out.println("Enter your weight in " + system + ":");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in " + system + ":");
        double height = sc.nextDouble();
        double bmi;

        if (system.equals("metric")) {
             bmi = (weight/0.45359237)*703/Math.pow(height/2.54, 2);
            System.out.println(analyzeBmi(bmi));
        } else if (system.equals("imperial")) {
             bmi = (weight*703) / Math.pow(height, 2);
            System.out.println(analyzeBmi(bmi));
        } else {
            System.out.println("You have entered an invalid system.");
        }
    }
}
