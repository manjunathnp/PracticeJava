package com.practiceSessions.general;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();

        factorialNum(num);
    }

    private static void factorialNum(int num) {
        int fact=1;
        for(int i=1; i<=num; i++){
            fact = fact * i;

        }
        System.out.println("Factorial of "+num+": "+fact);
    }

}
