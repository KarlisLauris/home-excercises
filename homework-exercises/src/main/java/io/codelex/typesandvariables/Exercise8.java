package io.codelex.typesandvariables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        DecimalFormat formatting = new DecimalFormat("#.##");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        double minutes = sc.nextDouble();
        double days = minutes/1440;
        double years = days / 365;
        System.out.println(formatting.format( minutes) + " minutes is " + formatting.format(years) + " years and " + formatting.format(days) + " days");
    }
}
