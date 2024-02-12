package com.scrible;

import java.util.Scanner;


public class PalindromeStrPract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputStr = sc.nextLine();

        checkForPalindrome(inputStr);

    }

    private static void checkForPalindrome(String inputStr) {
        String origStr = inputStr;
        String revStr="";

        for(int i=inputStr.length()-1; i>=0; i--){
            revStr = revStr + inputStr.charAt(i);
        }
        if(origStr.equalsIgnoreCase(revStr)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
    }
}
