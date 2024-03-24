package com.practiceSessions.session1;

import java.util.Scanner;

public class CountAlphNumSplChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        countAlphNumSplChars(inputStr);
    }

    private static void countAlphNumSplChars(String inputStr) {
        int alpha, numeric, spl, spaces;
        alpha = numeric = spl = spaces = 0;
        int ascii;
        char ch;

        for(int i=0; i<inputStr.length(); i++){
            ch = inputStr.charAt(i);
            ascii = inputStr.codePointAt(i);

            if(ascii==32){
                spaces++;
            }else if(ch >= '0' && ch <= '9')
                numeric++;
            else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
                alpha++;
            else
                spl++;
        }
        System.out.println("Alphabets: "+alpha);
        System.out.println("Numerics: "+numeric);
        System.out.println("Special Characters: "+spl);
        System.out.println("Spaces: "+spaces);
    }
}
