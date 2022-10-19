package io.codelex.collections.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        //TODO: add 5 values to Set.
        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Green");
        mySet.add("White");
        //..

        System.out.println("Should have 5 elements: " +mySet.stream().sorted().toList()); //Pay attention on order!


        mySet.forEach(System.out::println);

        mySet.clear();
        System.out.println("Should be empty: " + mySet);


        mySet.add("Orange");
        mySet.add("Purple");
        System.out.println(mySet);
    }

}
