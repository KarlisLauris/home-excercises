package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    static String[] words = {"dictionary","cheese","coding","java","codelex","programming","computer","keyboard","mouse","monitor"};

    public static void printArray(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
    public static void startANewGame(String word){
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        StringBuilder incorrectGuesses = new StringBuilder();
        String[] correctGuesses = new String[word.length()];
        Arrays.fill(correctGuesses, "_");
        while(true){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word: ");
            printArray(correctGuesses);
            System.out.println("Misses: "+incorrectGuesses);
            String currentGuess = "";
            System.out.print("Guess: ");

            while(currentGuess.length() != 1){
                String tryGuess = sc.nextLine();
                if(tryGuess.length()>1){
                    System.out.println("Only a single letter can be used");
                }else if(Arrays.asList(correctGuesses).contains(tryGuess)){
                    System.out.println("You have already guessed this letter");
                }else if(incorrectGuesses.toString().contains(tryGuess)){
                    System.out.println("You have already guessed this letter");
                }else{
                    currentGuess = tryGuess;
                }
            };
            if(word.contains(currentGuess)){
                for(int i = 0; i<word.length();i++){
                    if(word.charAt(i) == currentGuess.charAt(0)){
                        correctGuesses[i] = currentGuess;
                    }
                }
            }else{
                incorrectGuesses.append(currentGuess);
            }
            if (incorrectGuesses.length()==10){
                System.out.println("Too many incorrect guesses!");
                break;
            };
            if(!Arrays.asList(correctGuesses).contains("_")){
                System.out.println("You have won!");
                break;
            }

        }
    }
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        startANewGame(words[random.nextInt(words.length)]);
        while(true){
            System.out.println("Play \"again\" or \"quit\"?");
            String answer = sc.nextLine();
            if(answer.equals("again")){
                startANewGame(words[random.nextInt(words.length)]);
            }else if(answer.equals("quit")){
                break;
            }else{
                System.out.println("Please enter again or quit");
            }
        }
    }
}
