package com.revision.session1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        sumOfDigits(number);
    }
    private static void sumOfDigits(int number){
        int sum=0;
        while (number!=0){
            int rem = number%10;
            sum = sum+rem;
            number=number/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
