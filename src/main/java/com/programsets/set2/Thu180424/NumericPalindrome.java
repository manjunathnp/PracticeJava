package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class NumericPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        checkNumericPalindrome(number);
    }
    private static void checkNumericPalindrome(int number){
        int origNum = number;
        int rev = 0;

        while (number!=0){
            rev = rev * 10 + number%10;
            number = number/10;
        }
        System.out.println("Reversed Number: "+rev);
        if(rev == origNum){
            System.out.println("PALINDROME NUMBER");
        }else {
            System.out.println("NOT PALINDROME");
        }
    }
}
