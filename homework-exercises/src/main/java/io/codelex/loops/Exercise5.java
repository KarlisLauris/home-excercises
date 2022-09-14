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
        for(int i=1; i<=30; i++){
            if(i<=word1.length()){
                System.out.print(word1.charAt(i-1));
            }else if(i<=30-word2.length()){
                System.out.print(".");
            }else{
                System.out.print(word2.charAt(i-30+word2.length()-1));
            }
        }
    }
}
