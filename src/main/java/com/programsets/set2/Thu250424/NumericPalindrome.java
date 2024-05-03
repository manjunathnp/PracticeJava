package com.programsets.set2.Thu250424;

public class NumericPalindrome {
    public static void main(String[] args) {
        int num = 121;
        int orig = num;

        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }

        System.out.println("Reversed Number: "+rev);
        if(rev==orig){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }
    }
}
