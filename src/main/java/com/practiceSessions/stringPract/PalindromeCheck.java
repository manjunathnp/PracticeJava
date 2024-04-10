package com.practiceSessions.stringPract;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "test";
        int num = 123;

        checkStrPalindrome(str);
        //checkNumPalindrome(num);
    }

    private static void checkNumPalindrome(int num) {
        int orig = num;
        int rev=0;
        while(num!=0){
            rev = rev*10+ num%10;
            num = num/10;
        }
        if(orig==rev)
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");

    }

    private static void checkStrPalindrome(String str) {
        String orig = str;
        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(orig.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");


    }
}
