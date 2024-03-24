package com.exceptionhandling;

/*public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            //throw new RuntimeException("Division by Zero not allowed");
        }

        System.out.println("Program continues...");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0; // This will throw either ArrayIndexOutOfBoundsException or ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}*/

public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Print the exception message
            System.out.println("Exception Message: " + e.getMessage());

            // Print the stack trace
            System.out.println("Stack Trace:");
            e.printStackTrace();
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor; // This will throw an ArithmeticException
    }
}

