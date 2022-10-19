package io.codelex.maps.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1 {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Green");
        myMap.put(3, "Black");
        myMap.put(4, "White");
        myMap.put(5, "Blue");

        //TODO: Print size of myMap
        System.out.println("Size of myMap: " + myMap.size());

        //TODO: Check if myMap contains key 3
        if (myMap.containsKey(3)) {
            System.out.println("Key 3 is present in myMap");
        } else {
            System.out.println("Key 3 is not present in myMap");
        }

        //TODO: Check if myMap contains value "White"
        if (myMap.containsValue("White")) {
            System.out.println("Value White is present in myMap");
        } else {
            System.out.println("Value White is not present in myMap");
        }

        //TODO: Create new map and clone values from myMap into new map
        Map<Integer, String> newMap = new HashMap<>(myMap);
        System.out.println("New map values: " + newMap);
        //TODO: Iterate over map entries and print keys and values of each entry
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        //TODO: Clear myMap
        myMap.clear();
        System.out.println("Hash map after clearing: " + myMap);
    }

}
