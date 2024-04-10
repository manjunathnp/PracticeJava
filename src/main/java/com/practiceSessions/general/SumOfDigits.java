package com.practiceSessions.general;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        sumFinder(number);
    }

    private static void sumFinder(int number) {
        int sum=0;
        while (number!=0){
            int digit = number%10;
            sum = sum+digit;
            number=number/10;
        }
        System.out.println("Sum: "+sum);
    }
}
