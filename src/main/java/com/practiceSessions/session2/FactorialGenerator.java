package com.practiceSessions.session2;

import java.util.Scanner;

public class FactorialGenerator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        factorialFinder(num);
    }
    private static void factorialFinder(int num){
        int origNum = num;
        int fact=1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+origNum+" = "+fact);
    }
}
