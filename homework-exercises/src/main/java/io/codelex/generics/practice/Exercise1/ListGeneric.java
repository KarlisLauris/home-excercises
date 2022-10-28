package io.codelex.generics.practice.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric<T> {
    List<T> list = new ArrayList<>();

    public void add(int i, T el) {
        list.add(i, el);
    }

    public T get(int i) {
        return list.get(i);
    }

}
