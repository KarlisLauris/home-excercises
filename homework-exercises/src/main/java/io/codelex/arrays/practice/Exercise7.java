package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void PrintArray(String[][] gameBoard) {

            System.out.print(0+" "+1+" "+2);
            System.out.println();
        for (int t = 0; t < gameBoard.length; t++) {
            for (int i = 0; i < gameBoard[t].length; i++) {
                System.out.print(gameBoard[t][i] + " ");
            }
            System.out.println(t);
        }
    }
    public static Boolean lookForATie(String[][] gameBoard) {
        int counter = 0;
        for (int t = 0; t < gameBoard.length; t++) {
            for (int i = 0; i < gameBoard[t].length; i++) {
                if (Objects.equals(gameBoard[t][i], "X") || Objects.equals(gameBoard[t][i], "O")) {
                    counter++;
                }
            }
        }
        if (counter == 9) {
            System.out.println("It's a tie!");
            return true;
        }
        return false;
    }
    public static String[][] makeAMove(String[][] gameBoard, int row, int column, String player) {
        boolean taken = false;

        while(!taken){
            if (Objects.equals(gameBoard[row][column], "X") || Objects.equals(gameBoard[row][column], "O")) {
                System.out.println("This place is taken, try again");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose your location (row, column): ");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
            else{
                taken = true;
            }
        }
        gameBoard[row][column] = player;
        return gameBoard;
    }
    public static Boolean checkForAWinner(String[][] gameBoard) {
        for (int t = 0; t < gameBoard.length; t++) {
            if (Objects.equals(gameBoard[t][0], gameBoard[t][1]) && Objects.equals(gameBoard[t][1], gameBoard[t][2]) && !Objects.equals(gameBoard[t][0], " ")) {
                System.out.println("Player " + gameBoard[t][0] + " has won!");
                return true;
            }
        }
        for (int t = 0; t < gameBoard.length; t++) {
            if (Objects.equals(gameBoard[0][t], gameBoard[1][t]) && Objects.equals(gameBoard[1][t], gameBoard[2][t]) && !Objects.equals(gameBoard[0][t], " ")) {
                System.out.println("Player " + gameBoard[0][t] + " has won!");
                return true;
            }
        }
        if (Objects.equals(gameBoard[0][0], gameBoard[1][1]) && Objects.equals(gameBoard[1][1], gameBoard[2][2]) && !Objects.equals(gameBoard[0][0], " ")) {
            System.out.println("Player " + gameBoard[0][0] + " has won!");
            return true;
        }
        if (Objects.equals(gameBoard[0][2], gameBoard[1][1]) && Objects.equals(gameBoard[1][1], gameBoard[2][0]) && !Objects.equals(gameBoard[0][2], " ")) {
            System.out.println("Player " + gameBoard[0][2] + " has won!");
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean gameIsRunning = true;
        String[][] gameBoard = new String[3][3];
        String currentPlayer = "O";

        for (int i = 0; i < gameBoard.length; i++) {
            Arrays.fill(gameBoard[i], " ");
        }
        System.out.println("Starting a new game of Tic Tac Toe!");

        PrintArray(gameBoard);

        while (true){
            System.out.println("'"+currentPlayer+"'"+", choose your location (row, column): ");
            int row = sc.nextInt();
            int column = sc.nextInt();
            gameBoard = makeAMove(gameBoard, row, column, currentPlayer);
            PrintArray(gameBoard);
            if(checkForAWinner(gameBoard)) {
              break;
            }
            if (lookForATie(gameBoard)) {
                break;
            }
            currentPlayer = currentPlayer.equals("X") ? "O" : "X";
        }
    }
}
