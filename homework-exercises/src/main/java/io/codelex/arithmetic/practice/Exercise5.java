package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int number = (int) (Math.random() * 100) + 1;
        int guess = sc.nextInt();
        if (guess == number) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (guess < number) {
            System.out.println("Sorry, you are too low.  I was thinking of " + number);
        } else{
            System.out.println("Sorry, you are too high.  I was thinking of " + number);
        }
    }
}
