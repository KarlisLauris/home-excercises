package io.codelex.typesandvariables;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String input = sc.nextLine();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                counter++;
            }
        }
        System.out.println("The number of uppercase letters is " + counter);
    }
}
