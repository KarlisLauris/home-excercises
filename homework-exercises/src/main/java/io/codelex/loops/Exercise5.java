package io.codelex.loops;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = sc.nextLine();
        System.out.println("Enter second word: ");
        String word2 = sc.nextLine();

        //System.out.println(word1 + ".".repeat(30-word1.length()-word2.length()) + word2);
        int lineLength = 30;
        StringBuilder line = new StringBuilder(word1);
        for(int i=0; i<lineLength-word2.length()-word1.length(); i++) {
            line.append(".");
        }
        line.append(word2);
        System.out.println(line);
        System.out.println(line.length());
    }
}
