package io.codelex.classesandobjects;

import java.awt.*;

public class Exercise9 {
    //Write a method named swapPoints that accepts two Points as parameters and swaps their x/y values.
public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    private static void swapPoints(Point point1, Point point2) {
        int x = point1.x;
        int y = point1.y;
        point1.x = point2.x;
        point1.y = point2.y;
        point2.x = x;
        point2.y = y;
    }
}
