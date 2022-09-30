package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n;
        do {
            System.out.print("Input a positive number less than ten billion: ");
            while (!in.hasNextLong()) {
                System.out.println("That's not a number!");
                in.next();
            }
            n = in.nextLong();
        } while (n <= 0);

        if (n > 10000000000L) {
            System.out.println("Number is greater or equals 10,000,000,000!");
        } else {
            System.out.println("Number of digits in the number: " + String.valueOf(n).length());
        }
    }
}
