package com.practiceSessions.general;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        digitCounter(number);
    }

    private static void digitCounter(int number) {
        int count=0;
        while(number!=0){
            number = number/10;
            count++;
        }
        System.out.println("TOTAL DIGITS: "+count);
    }

}
