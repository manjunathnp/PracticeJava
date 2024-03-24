package com.practiceSessions.session3;

import java.util.Scanner;

public class CountAlphNumSplChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        //countAlphNumSplChars(inputStr);
        countAlphNumSplChars2(inputStr);
    }

    private static void countAlphNumSplChars2(String inputStr) {
        char[] charArray=inputStr.toCharArray();
        int alphabets, numerics, spaces, splChars;
        alphabets = numerics = spaces = splChars = 0;

        for(char ch: charArray){
            if(ch >= '0' & ch <= '9'){
                numerics++;
            }else if(ch >= 'a' & ch <= 'z' || ch >= 'A' & ch <= 'Z'){
                alphabets++;
            }else if(ch == ' '){
                spaces++;
            }else {
                splChars++;
            }
        }
        System.out.println("Alphabets: "+alphabets);
        System.out.println("Numerics: "+numerics);
        System.out.println("Spaces: "+spaces);
        System.out.println("Spl Chars: "+splChars);
    }

    private static void countAlphNumSplChars(String inputStr){
        char[] charArray=inputStr.toCharArray();
        int alphabets, numerics, spaces, splChars;
        alphabets = numerics = spaces = splChars = 0;

        for(char ch: charArray){
            if(Character.isWhitespace(ch)){
                spaces++;
            }else if(Character.isDigit(ch)){
                numerics++;
            }else if(Character.isAlphabetic(ch)){
                alphabets++;
            }else{
                splChars++;
            }
        }
        System.out.println("Alphabets: "+alphabets);
        System.out.println("Numerics: "+numerics);
        System.out.println("Spaces: "+spaces);
        System.out.println("Spl Chars: "+splChars);
    }
}
