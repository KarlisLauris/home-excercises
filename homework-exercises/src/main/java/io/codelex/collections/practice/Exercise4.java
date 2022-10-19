package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        while (true){
            System.out.println("Enter name:");
            String name = sc.nextLine();
            if (name.equals("")){
                break;
            }
            names.add(name);
        }
        System.out.println("Unique name list contains: " + names);
    }
}
