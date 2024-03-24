package com.scrible;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        factorial(num);
    }

    private static void factorial(int num) {
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial: "+fact);
    }
}
