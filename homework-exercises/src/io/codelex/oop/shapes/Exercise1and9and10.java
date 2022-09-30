package io.codelex.oop.shapes;

public class Exercise1and9and10 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(3, 4);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Hexagon(3);

        Shape3D[] shapes3D = new Shape3D[2];
        shapes3D[0] = new Qube(3, 4, 5);
        shapes3D[1] = new Cone(3, 4);

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Number of sides: " + shape.getNumSides());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
        for (Shape3D shape3D : shapes3D) {
            System.out.println("Shape: " + shape3D.getClass().getSimpleName());
            System.out.println("Number of sides: " + shape3D.getNumSides());
            System.out.println("Area: " + shape3D.getArea());
            System.out.println("Perimeter: " + shape3D.getPerimeter());
            System.out.println("Volume: " + shape3D.getVolume());
            System.out.println();
        }
    }
}
