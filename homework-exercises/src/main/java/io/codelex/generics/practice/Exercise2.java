package io.codelex.generics.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World");
        List<Number> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(concatenate(list));
        System.out.println(concatenate(numbers));
    }

    public static String concatenate(List<?> list) {
        String result = null;
        String separator = "";
        Object element = list.stream().findFirst().orElse(null);
        if (element instanceof String) {
            result = "String: ";
            separator = " ";
        } else if (element instanceof Integer) {
            result = "Integer: ";
            separator = "+";
        }
        result = result + list.stream().map(Object::toString).collect(Collectors.joining(separator));
        return result;
    }
}
