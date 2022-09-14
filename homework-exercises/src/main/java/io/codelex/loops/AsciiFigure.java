package io.codelex.loops;

public class AsciiFigure {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size*4 - 4 * i; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= 8 * i - 8; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= size*4-4*i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
