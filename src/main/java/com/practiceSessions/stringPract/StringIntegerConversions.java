package com.practiceSessions.stringPract;

import java.util.Scanner;

public class StringIntegerConversions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        System.out.println("Enter the String(in number format): ");
        String str = scanner.next();

        numberToStr(number);
        stringToNum(str);
    }

    private static void stringToNum(String str) {
        int convertedNumber = Integer.parseInt(str);
        System.out.println("Converted from String to Number: "+convertedNumber);
    }

    private static void numberToStr(int number) {
        String convertedString = String.valueOf(number);
        System.out.println("Converted from Number to String: "+convertedString);
    }
}
