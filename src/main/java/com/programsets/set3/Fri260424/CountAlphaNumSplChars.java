package com.programsets.set3.Fri260424;

public class CountAlphaNumSplChars {
    public static void main(String[] args) {
        String inputStr = "Email: test@test12.com";

        char[] charArray = inputStr.toCharArray();
        int alphabets=0; int digits=0; int spaces=0;  int spl=0;
        for(char character: charArray){
            if(Character.isAlphabetic(character)){
                alphabets++;
            }else if(Character.isDigit(character)){
                digits++;
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
