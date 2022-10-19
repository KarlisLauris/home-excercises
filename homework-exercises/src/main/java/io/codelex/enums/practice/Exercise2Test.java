package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wins = 0;
        int losses = 0;
        System.out.println("Let us begin...");
        while(true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.println("Your turn (Enter s for scissor, p for paper,t for stone, q to quit): ");
            String input = scanner.next();
            if (input.equals("q")) {
                double playerPercentage = Math.round((wins * 100.0 / (wins + losses)) * 100.0) / 100.0;
                double computerPercentage = Math.round((losses * 100.0 / (wins + losses)) * 100.0) / 100.0;
                System.out.println("I won "+losses+"("+computerPercentage+"%). You won "+wins+"("+playerPercentage+"%).");
                break;
            }
            Exercise2 player = Exercise2.fromValue(input);
            Exercise2 computer = Exercise2.values()[new Random().nextInt(3)];
            System.out.println("My turn: "+computer);

            if (player == computer) {
                System.out.println("It is a draw!");
            } else if (player == Exercise2.STONE && computer == Exercise2.SCISSORS) {
                System.out.println("You won!");
                wins++;
            } else if (player == Exercise2.PAPER && computer == Exercise2.STONE) {
                System.out.println("You won!");
                wins++;
            } else if (player == Exercise2.SCISSORS && computer == Exercise2.PAPER) {
                System.out.println("You won!");
                wins++;
            } else {
                System.out.println(computer.getWin());
                losses++;
            }
        }
   }
}
