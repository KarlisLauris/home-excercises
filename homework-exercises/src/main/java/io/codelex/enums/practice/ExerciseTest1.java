package io.codelex.enums.practice;

public class ExerciseTest1 {
    public static void main(String[] args) {

        for (Exercise1 exercise1 : Exercise1.values()) {
            System.out.println(exercise1 + " " + exercise1.getDirection() + " "+ exercise1.ordinal());
        }
    }
}
