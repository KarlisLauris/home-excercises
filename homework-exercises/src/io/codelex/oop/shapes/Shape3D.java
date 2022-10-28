package io.codelex.oop.shapes;

public abstract class Shape3D extends Shape {
    private int numSides;

    public Shape3D(int numSides) {
        super(numSides);
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getVolume();
}
