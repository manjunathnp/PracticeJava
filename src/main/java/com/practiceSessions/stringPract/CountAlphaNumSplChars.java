package com.practiceSessions.stringPract;

import java.util.Scanner;

public class CountAlphaNumSplChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        countAlphaNumSplChars(inputStr);
    }

    private static void countAlphaNumSplChars(String inputStr){
        int alphabets = 0, numerics = 0, splChars = 0, spaces = 0;

        for(char character: inputStr.toCharArray()){
            if(Character.isAlphabetic(character)){
                alphabets++;
            }else if(Character.isWhitespace(character)){
                spaces++;
            }else if(Character.isDigit(character)){
                numerics++;
            }else {
                splChars++;
            }
        }
        System.out.println("Alphabets: "+alphabets);
        System.out.println("Numerics: "+numerics);
        System.out.println("Special Characters: "+splChars);
        System.out.println("Spaces: "+spaces);
    }
}
