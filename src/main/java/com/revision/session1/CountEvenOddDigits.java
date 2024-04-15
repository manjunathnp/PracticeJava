package com.revision.session1;

import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        countEvenOddDigits(number);
    }

    private static void countEvenOddDigits(int number){
        int evenDigitCounter = 0, oddDigitCounter = 0;
        int evenDigitSum=0, oddDigitSum=0;
        while (number!=0){
            int rem = number%10;
            if(rem%2==0){
                evenDigitCounter++;
                evenDigitSum += rem;
            }else {
                oddDigitCounter++;
                oddDigitSum += rem;
            }
            number = number/10;
        }
        System.out.println("Even Digits: "+evenDigitCounter+"\n"+"Odd Digits: "+oddDigitCounter);
        System.out.println("Even Digits Sum: "+evenDigitSum+"\n"+"Odd Digits Sum: "+oddDigitSum);
    }
}
