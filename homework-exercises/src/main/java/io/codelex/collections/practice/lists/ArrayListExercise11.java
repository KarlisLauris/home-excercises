package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements

        //TODO: Add 10 values to list

        //TODO: Add new value at 5th position

        //TODO: Change value at last position (Calculate last position programmatically)

        //TODO: Sort your list in alphabetical order

        //TODO: Check if your list contains "Foobar" element

        //TODO: Print each element of list using loop
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Brown");
        System.out.println(colors);
        colors.add(4, "Gray");
        colors.set(colors.size()-1, "Violet");
        System.out.println(colors);
        colors.sort(String::compareTo);
        System.out.println(colors);
        if (colors.contains("Foobar")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        for (String color : colors) {
            System.out.println(color);
        }

    }

}
