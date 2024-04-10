package com.practiceSessions.general;

import java.util.Scanner;

public class FactorialGenerator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        factorialGenerator(num);

        scanner.close();
    }

    private static void factorialGenerator(int num){
        int fact=1;
        int origNum=num;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+origNum+" = "+fact);
    }
}
