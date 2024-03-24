package com.practiceSessions.session2;

import java.util.Scanner;

public class CountAlphNumSplChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        //countAlphNumSplChars(inputStr);
        countAlphNumSplCharacters(inputStr);
    }

    private static void countAlphNumSplCharacters(String inputStr) {
        char[] charArray=inputStr.toCharArray();
        int alph, num, spl, spaces;
        alph=num=spl=spaces=0;
        int ascii;

        for(char ch: charArray) {
            ascii = (int) ch;

            if(Character.isAlphabetic(ch))
                alph++;
            else if(Character.isDigit(ch))
                num++;
            else if(Character.isWhitespace(ch))
                spaces++;
            else
                spl++;
        }

        System.out.println("Alphabets: "+alph);
        System.out.println("Numerics: "+num);
        System.out.println("Spl Chars: "+spl);
        System.out.println("Spaces: "+spaces);
    }

    private static void countAlphNumSplChars(String inputStr){
        char[] charArray=inputStr.toCharArray();
        int alph, num, spl, spaces;
        alph=num=spl=spaces=0;
        int ascii;

        for(char ch: charArray){
            ascii = (int)ch;

            if(ascii==32)
                spaces++;
            else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
                alph++;
            else if(ch >='0' && ch <= '9')
                num++;
            else
                spl++;
        }
        System.out.println("Alphabets: "+alph);
        System.out.println("Numerics: "+num);
        System.out.println("Spl Chars: "+spl);
        System.out.println("Spaces: "+spaces);
    }
}
