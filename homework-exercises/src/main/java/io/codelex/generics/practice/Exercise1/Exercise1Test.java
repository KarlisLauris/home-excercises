package io.codelex.generics.practice.Exercise1;

public class Exercise1Test {
    public static void main(String[] args) {
        ListGeneric<String> list = new ListGeneric<>();
        list.add(0, "Hello");
        list.add(1, "World");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
