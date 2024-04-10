package com.practiceSessions.general;

import java.util.Scanner;

public class EvenOddDigitsSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        evenOddDigitsSum(number);
    }

    private static void evenOddDigitsSum(int number) {
        int eSum = 0, oSum = 0;

        while (number!=0){
            int digit = number%10;
            if(digit%2 == 0){
                eSum += digit;
            }else {
                oSum += digit;
            }
            number /= 10;
        }
        System.out.println("Sum of Even Digits: "+eSum);
        System.out.println("Sum of Odd Digits: "+oSum);
    }
}
