package io.codelex.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first date: ");
        LocalDate firstDate = LocalDate.parse(scanner.next());
        System.out.println("Enter second date: ");
        LocalDate secondDate = LocalDate.parse(scanner.next());
        System.out.println(firstDate+" "+secondDate);
        long days = firstDate.until(secondDate, ChronoUnit.DAYS);
        System.out.println("Days: "+days);
        long hours = days * 8;
        for (int i = 0; i < days; i++) {
            if (firstDate.plusDays(i).getDayOfWeek().getValue() > 5) {
                hours -= 8;
                System.out.println("Weekend: "+firstDate.plusDays(i));
            }
        }
        System.out.println("Hours: " + hours);
    }
}
