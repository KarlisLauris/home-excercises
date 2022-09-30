package io.codelex.loops;

import java.util.Random;
import java.util.Scanner;

public class Piglet  {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int roll = 0;
        Random random = new Random();
        System.out.println("Welcome to Piglet!");
        while (roll != 1) {
            roll = random.nextInt(6) + 1;
            System.out.println("You rolled a " + roll);
            if (roll == 1) {
                score = 0;
                System.out.println("You got 0 points.");
            } else {
                score += roll;
                System.out.println("Roll again? (y/n)");
                String answer = scanner.nextLine().toLowerCase();
                if (answer.equals("n")) {
                    System.out.println("You got " + score + " points.");
                    break;
                }
            }
        }
    }
}
