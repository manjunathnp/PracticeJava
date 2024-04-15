package com.revision.session1;

import java.util.Scanner;

public class CountAlphaNumSplChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        countAlphaNumSplChars(inputStr);
    }
    private static void countAlphaNumSplChars(String inputStr){
        int alphabets = 0, numerics = 0, spl = 0, spaces=0;

        for(char ch: inputStr.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets++;
            }else if(Character.isSpaceChar(ch)){
                spaces++;
            }else if(Character.isDigit(ch)){
                numerics++;
            }else{
                spl++;
            }
        }
        System.out.println("Alphabets: "+alphabets+"\nNumerics: "+numerics+"\nSpecial Characters: "+spl+"\nSpaces: "+spaces);
    }
}
