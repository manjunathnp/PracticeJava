package com.stringpgms;

import java.util.Scanner;

public class TestStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        //reverseStr(inputStr);
        checkForPalindrome(inputStr);


    }

    private static void checkForPalindrome(String inputStr) {
        String origStr = inputStr;
        String rev = "";
        for(int i=inputStr.length()-1; i>=0; i--){
            rev = rev + inputStr.charAt(i);
        }
        if(origStr.equalsIgnoreCase(rev))
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");
    }

    private static void reverseStr(String inputStr) {
        String rev="";
        for(int i=inputStr.length()-1; i>=0; i--){
            rev = rev + inputStr.charAt(i);
        }
        System.out.println("Reversed String: "+rev);
    }


}
