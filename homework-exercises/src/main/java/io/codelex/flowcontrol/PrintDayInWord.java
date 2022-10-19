package io.codelex.flowcontrol;

public class PrintDayInWord {
    public static void main(String[] args) {
        int day = 1;
        String dayString = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not a valid day";
        };
        System.out.println(dayString);
    }
}
