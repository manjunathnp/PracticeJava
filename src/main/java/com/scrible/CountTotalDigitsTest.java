package com.scrible;

import java.util.Scanner;

public class CountTotalDigitsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numeric digits: ");
        int num = scanner.nextInt();
        int origNum = num;

        countTotalDigits(num, origNum);
    }

    private static void countTotalDigits(int num, int origNum) {
        int count=0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Total Digits in "+origNum+" = "+count);
    }
}
