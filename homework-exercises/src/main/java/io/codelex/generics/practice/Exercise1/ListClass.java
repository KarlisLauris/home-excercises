package io.codelex.generics.practice.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    private final List<Object> list = new ArrayList<>();

    public void add(int i, Object el) {
        list.add(i, el);
    }

    public Object get(int i) {
        return list.get(i);
    }
}
