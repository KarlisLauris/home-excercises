package io.codelex.arithmetic;

public class Exercise8 {
    public static String CalculateWage(double hours, double rate) {
        double pay = 0;
        if (hours > 60) {
            return "You can't work more than 60 hours a week";
        } else if (rate < 8.0) {
            return "You can't work for less than minimum wage";
        } else if (hours > 40) {
            pay = 40 * rate + (hours - 40) * rate * 1.5;
        } else {
            pay = hours * rate;
        }
        return "Wage: " + pay;
    }

    public static void main(String[] args) {
        System.out.println("Employee 1 "+CalculateWage(35, 7.50));
        System.out.println("Employee 2 "+CalculateWage(47, 8.20));
        System.out.println("Employee 3 "+CalculateWage(73, 10.00));

    }
}
