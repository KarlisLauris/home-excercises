package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("The sum of the dimensions (x, y, z) exceeds 300");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Each size is less than 30");
            return false;
        }
        if (weight > 15.0 && isExpress) {
            System.out.println("The weight exceeds 15.0 for isExpress = true");
            return false;
        }
        if (weight > 30.0 && !isExpress) {
            System.out.println("The weight exceeds 30.0 for isExpress = false");
            return false;
        }

        return true;
    }
}
