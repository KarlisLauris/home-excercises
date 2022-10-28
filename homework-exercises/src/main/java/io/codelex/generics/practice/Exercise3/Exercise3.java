package io.codelex.generics.practice.Exercise3;

import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<ChildClass> list = List.of(new ChildClass(), new ChildClass());
        List<ClassY> list2 = List.of(new ClassY(), new ClassY());

        addAllX(list, list2);


        //Y nestrada ar super klasem
    }

    public static <T> void add(T value, List<? super T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        l.addAll(v);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        l.addAll(v);
    }
}
