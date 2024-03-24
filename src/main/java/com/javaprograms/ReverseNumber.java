package com.javaprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = sc.nextInt();

        reverseNum(num);
    }

    private static void reverseNum(int num){
        int origNum = num;
        int rev=0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse of num "+origNum+" = "+rev);
    }
}
