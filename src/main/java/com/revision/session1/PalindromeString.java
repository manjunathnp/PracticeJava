package com.revision.session1;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr=scanner.nextLine();

        palindromCheck(inputStr);
    }
    private static void palindromCheck(String inputStr){
        String revStr = "";
        String origStr = inputStr;

        for(int i=inputStr.length()-1; i>=0; i--){
            revStr = revStr + inputStr.charAt(i);
        }

        if(revStr.equalsIgnoreCase(origStr)){
            System.out.println("PALINDROME STRING");
        }else {
            System.out.println("NOT PALINDROME STRING");
        }
    }
}
