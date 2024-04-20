package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        checkPalindrome(inputStr);
    }

    private static void checkPalindrome(String inputStr){
        String origStr = inputStr;
        String revStr = "";

        for(int i=inputStr.length()-1; i>=0; i--){
            revStr += inputStr.charAt(i);
        }
        System.out.println("Reversed String: "+revStr);
        if(revStr.equalsIgnoreCase(origStr)){
            System.out.println("PALINDROME STRING");
        }else {
            System.out.println("NOT PALINDROME STRING");
        }
    }
}
