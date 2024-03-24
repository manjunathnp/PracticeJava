package com.scrible;

import java.util.Scanner;

public class CountSumDigitsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numeric digits: ");
        int num = scanner.nextInt();
        int origNum = num;

        countSumDigits(num, origNum);
    }

    private static void countSumDigits(int num, int origNum) {
        int sum=0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("Sum of all the digits in the number "+origNum+" = "+sum);
    }
}
