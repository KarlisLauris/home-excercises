package io.codelex.practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static LocalDate[] getServerUpdateDates(LocalDate date) {
        LocalDate[] dates = new LocalDate[2];
        LocalDate copy = date;
        int counter = 0;
        while(copy.getMonth() == date.plusDays(14).getMonth()){
            dates[counter] = date.plusDays(14);
            date = date.plusDays(14);
            counter++;;
        }
        return dates;
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter server launch year-month-date: ");
            LocalDate serverLaunchDate = LocalDate.parse(scanner.next());

            System.out.println(Arrays.toString(getServerUpdateDates(serverLaunchDate)));
        }
}
