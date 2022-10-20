package io.codelex.classesandobjects;

import io.codelex.classesandobjects.Classes.Car;
import java.util.Scanner;

public class LitersPerKilometer {
    public static void main( String[] args )  {
        Scanner scan = new Scanner(System.in);

        Car car = getCarData();
        System.out.println("Fill up, enter milage: ");
        double milage = scan.nextDouble();
        System.out.println("Enter liters: ");
        double liters = scan.nextDouble();
        car.fillUp(milage, liters);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
    }
    private static Car getCarData(){
        Scanner scan = new Scanner(System.in);

        double startKilometers;
        System.out.print("Enter first reading: " );

        startKilometers = scan.nextDouble();

        return new Car(startKilometers);
    }
}


