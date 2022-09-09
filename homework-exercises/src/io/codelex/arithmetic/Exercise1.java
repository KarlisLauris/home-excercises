package io.codelex.arithmetic;

public class Exercise1 {
    public static boolean isFifteen(int a, int b) {
        return a == 15 || b == 15 || a + b == 15 || Math.abs(a - b) == 15;
    }
    public static void main(String[] args) {
        System.out.println(isFifteen(15, 0));
    }
}
