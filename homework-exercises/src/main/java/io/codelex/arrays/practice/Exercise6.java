package io.codelex.arrays.practice;
import java.util.Arrays;
import java.util.Random;
public class Exercise6 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] Array1 = new int[10];
        for (int i = 0; i <Array1.length ; i++) {
            Array1[i] = rand.nextInt(100)+1;
        }
        int[] Array2 = Array1.clone();
        Array2[Array2.length-1] = -7;
        System.out.println("Array 1: "+ Arrays.toString(Array1));
        System.out.println("Array 2: "+ Arrays.toString(Array2));
    }
}
