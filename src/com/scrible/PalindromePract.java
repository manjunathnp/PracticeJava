package com.scrible;

import java.util.Scanner;

public class PalindromePract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        checkPalindrome(num);
    }

    private static void checkPalindrome(int num) {
        int origNum = num;
        int rev = 0;

        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        if(rev == origNum){
            System.out.println(origNum+" is PALINDROME");
        }else{
            System.out.println(origNum+" is NOT PALINDROME");
        }
    }
}
