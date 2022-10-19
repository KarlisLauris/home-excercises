package io.codelex.practice;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d = getInput(String.valueOf(-10));
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException  e) {
            System.out.println(e.getMessage());

        }
    }

    static double getInput(String s) {
        double d = Double.parseDouble(s);
        if (d <= 0) {
            throw new NonPositiveNumberException("Number must be positive.");
        }
        return d;
    }
}
