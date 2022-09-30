package io.codelex.oop.shapes;

public class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        super(6);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return 3 * Math.sqrt(3) * side * side / 2;
    }

    @Override
    public double getPerimeter() {
        return 6 * side;
    }
}
