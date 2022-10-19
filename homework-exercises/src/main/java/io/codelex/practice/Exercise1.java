package io.codelex.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Integer numerator = null;

        while (true) {
            try{
                System.out.println("Enter the numerator");
                String numeratorString = scanner.next();
                if(numeratorString.toLowerCase().equals("q")){
                    System.exit(0);
                }
                numerator = Integer.parseInt(numeratorString);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            }
            catch (ArithmeticException e){
                System.out.println("Division by zero is not allowed");
            }
            catch (NumberFormatException e){
                System.out.println("Poor input data");
                scanner.nextLine();
            }
        }
    }
}
