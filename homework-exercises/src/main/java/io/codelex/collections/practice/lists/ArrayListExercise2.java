package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;
public class ArrayListExercise2 {

    //TODO: Write a Java program to iterate through all elements in a array list.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        colors.forEach(System.out::println);
    }
}
