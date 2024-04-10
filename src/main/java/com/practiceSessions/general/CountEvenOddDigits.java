package com.practiceSessions.general;

import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        evenOddDigitsCounter(number);
    }

    private static void evenOddDigitsCounter(int number) {
        int eCount = 0, oCount = 0;

        while (number!=0){
            int digit = number%10;
            if(digit%2 == 0){
                eCount++;
            }else {
                oCount++;
            }
            number = number/10;
        }
        System.out.println("Total Even Digits: "+eCount);
        System.out.println("Total Odd Digits: "+oCount);
    }
}
