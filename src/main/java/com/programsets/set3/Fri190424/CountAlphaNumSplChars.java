package com.programsets.set3.Fri190424;

import java.util.Scanner;

public class CountAlphaNumSplChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        countAlphaNumSplChars(inputStr);
    }
    private static void countAlphaNumSplChars(String inputStr){
        char[] charArray = inputStr.toCharArray();
        int digits=0, alphabets=0, spaces=0, spl=0;
        for(char character: charArray){
            if(Character.isDigit(character)){
                digits++;
            }else if(Character.isAlphabetic(character)){
                alphabets++;
            }else if(Character.isSpaceChar(character)){
                spaces++;
            }else {
                spl++;
            }
        }
        System.out.println("Alphabets: "+alphabets);
        System.out.println("Numerics: "+digits);
        System.out.println("Spaces: "+spaces);
        System.out.println("Special Characters: "+spl);
    }
}
