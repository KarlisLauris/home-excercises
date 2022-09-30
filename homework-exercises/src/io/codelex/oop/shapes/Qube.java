package io.codelex.oop.shapes;

public class Qube extends Shape3D{
    private double width;
    private double height;
    private double depth;

    public Qube(double width, double height, double depth) {
        super(6);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getPerimeter() {
        return 4 * (width + height + depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }
}
