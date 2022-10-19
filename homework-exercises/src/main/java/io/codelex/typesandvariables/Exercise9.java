package io.codelex.typesandvariables;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println("Input hour: ");
        double hour = sc.nextDouble();
        System.out.println("Input minutes: ");
        double minutes = sc.nextDouble();
        System.out.println("Input seconds: ");
        double seconds = sc.nextDouble();
        double time = hour * 3600 + minutes * 60 + seconds;
        double speed = meters / time;
        System.out.println("Your speed in meters/second is " + speed);
        System.out.println("Your speed in km/h is " + speed * 3.6);
        System.out.println("Your speed in miles/h is " + speed * 2.236936);
    }
}
