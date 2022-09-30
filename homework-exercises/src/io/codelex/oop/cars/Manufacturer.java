package io.codelex.oop.cars;

import java.util.Collection;
import java.util.Objects;

public class Manufacturer {
    //Create a Manufacturer class that will contain fields: name, year of establishment, country. Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.

    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer that)) return false;
        return getYearOfEstablishment() == that.getYearOfEstablishment() && getName().equals(that.getName()) && getCountry().equals(that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

}
