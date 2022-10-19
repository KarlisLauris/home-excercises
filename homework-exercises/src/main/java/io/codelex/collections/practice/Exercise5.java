package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> seen = new HashSet<>();
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while (number != 1) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            if (seen.contains(sum)) {
                System.out.println("not happy");
                System.exit(0);
            }
            seen.add(sum);
            number = sum;
        }
        System.out.println("happy");
    }
}
