package com.practiceSessions.general;

import java.util.Scanner;

public class CountAlphaNumSplChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        countAlphaNumSplChars(inputStr);
    }

    private static void countAlphaNumSplChars(String inputStr) {
        char[] charArray=inputStr.toCharArray();
        int alpha = 0, numeric = 0, spaces = 0, spl = 0;
        for(char ch: charArray){
            if(Character.isAlphabetic(ch)){
                alpha++;
            }else if(Character.isDigit(ch)){
                numeric++;
            }else if(Character.isWhitespace(ch)){
                spaces++;
            }else{
                spl++;
            }
        }
        System.out.println("Alphabets: "+alpha);
        System.out.println("Numerics: "+numeric);
        System.out.println("Special Characters: "+spl);
        System.out.println("Spaces: "+spaces);
    }
}
