package io.codelex.loops;

import java.util.Scanner;
import java.util.Random;

public class RollTwoDice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter desired sum of two dice: ");
        int desiredSum = sc.nextInt();
        System.out.println("Desired sum is: " + desiredSum);
        int dice1 = 0;
        int dice2 = 0;
        while (dice1 + dice2 != desiredSum) {
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            System.out.println(dice1+" and "+dice2+" = "+(dice1+dice2));
        }
    }
}
