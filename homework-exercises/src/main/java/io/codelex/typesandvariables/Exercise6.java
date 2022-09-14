package io.codelex.typesandvariables;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while (number != 0) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
