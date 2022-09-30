package io.codelex.oop.imperialToMetric;

public class Exercise5 {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();
        System.out.println(converter.convert(1, ConversionType.METERS_TO_YARDS));
        System.out.println(converter.convert(1, ConversionType.YARDS_TO_METERS));
        System.out.println(converter.convert(1, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(converter.convert(1, ConversionType.KILOMETERS_TO_MILES));
    }
}
