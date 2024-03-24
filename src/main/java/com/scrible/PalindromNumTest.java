package com.scrible;

public class PalindromNumTest {
    public static void main(String[] args) {
        int num = 121;
        int origNum = num;

        int rev=0;
        while (num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if(rev == origNum){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}
