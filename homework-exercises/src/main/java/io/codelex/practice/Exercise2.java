package io.codelex.practice;

public class Exercise2 {
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC() throws ArithmeticException {
        try{
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
