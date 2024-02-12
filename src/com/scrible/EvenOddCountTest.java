package com.scrible;

import java.util.Scanner;

public class EvenOddCountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        checkEvenOddDigitsCount(num);
    }
    private static void checkEvenOddDigitsCount(int num){
        int origNum = num;
        int eCount = 0, oCount=0;

        while(num!=0){

            if(num%2==0){
                eCount++;
            }else{
                oCount++;
            }
            num = num/10;
        }

        System.out.println("Even Digits Count in "+origNum+": "+eCount);
        System.out.println("Odd Digits Count in "+origNum+": "+oCount);
    }
}
