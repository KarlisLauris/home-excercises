package io.codelex.loops;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Min?");
        int min = sc.nextInt();
        System.out.println("Max?");
        int max = sc.nextInt();
        for(int i=min;i<=max;i++){
            for(int j=i;j<=max;j++){
                System.out.print(j);
            }
            for(int k=min;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
