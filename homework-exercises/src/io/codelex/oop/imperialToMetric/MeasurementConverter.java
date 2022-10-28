package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public double convert(double value, ConversionType conversionType) {
        return conversionType.convert(value);
    }

}
