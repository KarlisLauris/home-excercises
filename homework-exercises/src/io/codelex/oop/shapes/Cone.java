package io.codelex.oop.shapes;

public class Cone extends Shape3D{
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        super(1);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
