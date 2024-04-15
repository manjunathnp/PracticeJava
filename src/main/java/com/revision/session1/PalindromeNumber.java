package com.revision.session1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        palindromeCheck(number);
    }
    private static void palindromeCheck(int number){
        int orig=number;
        int rev=0;
        while (number!=0){
            rev = rev*10+number%10;
            number = number/10;
        }
        if(orig==rev){
            System.out.println(orig+" is PALINDROME NUMBER");
        }else {
            System.out.println(orig+" is NOT PALINDROME NUMBER");
        }
    }
}
