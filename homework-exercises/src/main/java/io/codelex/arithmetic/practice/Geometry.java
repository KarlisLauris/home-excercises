package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        if (radius.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Error("Radius must be positive");
        }
        return Math.PI *radius.doubleValue()*2;
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Error("Length must be positive");
        }
        if (width.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Error("Width must be positive");
        }
        return length.multiply(width).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        if (base.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Error("Base must be positive");
        }
        if (h.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Error("Height must be positive");
        }
        return base.multiply(h).multiply(BigDecimal.valueOf(0.5)).doubleValue();
    }
}
