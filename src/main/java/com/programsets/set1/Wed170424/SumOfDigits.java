package com.programsets.set1.Wed170424;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        sumOfDigits(num);
    }
    private static void sumOfDigits(int num){
        int sum = 0;
        while (num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum: "+sum);
    }
}
