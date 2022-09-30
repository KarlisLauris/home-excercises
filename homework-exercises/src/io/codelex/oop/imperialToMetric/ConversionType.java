package io.codelex.oop.imperialToMetric;
//Create a ConversionType enum class with the constants METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS. Enum should have a Converter type parameter used to perform calculations for a given type.

public enum ConversionType {
    METERS_TO_YARDS(Converter.METERS_TO_YARDS),
    YARDS_TO_METERS(Converter.YARDS_TO_METERS),
    CENTIMETERS_TO_INCHES(Converter.CENTIMETERS_TO_INCHES),
    INCHES_TO_CENTIMETERS(Converter.INCHES_TO_CENTIMETERS),
    KILOMETERS_TO_MILES(Converter.KILOMETERS_TO_MILES),
    MILES_TO_KILOMETERS(Converter.MILES_TO_KILOMETERS);
    private final Converter converter;
    ConversionType(Converter converter) {
        this.converter = converter;
    }
    public double convert(double value) {
        return converter.convert(value);
    }
    private interface Converter {
        double convert(double value);
        Converter METERS_TO_YARDS = value -> value * 1.09361;
        Converter YARDS_TO_METERS = value -> value * 0.9144;
        Converter CENTIMETERS_TO_INCHES = value -> value * 0.393701;
        Converter INCHES_TO_CENTIMETERS = value -> value * 2.54;
        Converter KILOMETERS_TO_MILES = value -> value * 0.621371;
        Converter MILES_TO_KILOMETERS = value -> value * 1.60934;
    }
}

