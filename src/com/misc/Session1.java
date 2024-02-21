package com.misc;

import java.util.Scanner;

public class Session1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        checkAlphaNumSpl(inputStr);
        wordCount(inputStr);
        capitalizeStr(inputStr);

    }

    private static void capitalizeStr(String inputStr) {
        char[] characters = inputStr.toCharArray();

        for(char ch:characters){
            if(characters.length>0){
                characters[0] = Character.toUpperCase(characters[0]);
            }
        }

        for(int i=1; i<characters.length; i++){
            if(characters[i-1]==' '){
                characters[i] = Character.toUpperCase(characters[i]);
            }
        }
        System.out.println("Capitalized: "+new String(characters));
    }

    private static void wordCount(String inputStr) {
        String[] words=inputStr.split("\s");
        System.out.println("Total count of words: "+words.length);
    }

    private static void checkAlphaNumSpl(String inputStr) {
        int numbers, alphabets, splChars, spaces;
        numbers = alphabets = spaces = splChars = 0;

        for(int i=0; i<inputStr.length(); i++){
            int ascii = inputStr.codePointAt(i);
            int ch = inputStr.charAt(i);

            if(ch >= '0' && ch <= '9'){
                numbers++;
            } else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                alphabets++;
            }else if(ascii==32){
                spaces++;
            }else {
                splChars++;
            }

        }
        System.out.println("Numbers: "+numbers);
        System.out.println("Alphabets: "+alphabets);
        System.out.println("Spaces: "+spaces);
        System.out.println("Spl characters: "+splChars);
    }
}
