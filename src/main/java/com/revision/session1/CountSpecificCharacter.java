package com.revision.session1;

import java.util.Scanner;

public class CountSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Enter the character to be counted: ");
        char character = scanner.next().charAt(0);
        countAlphaNumSplChars(inputStr, character);
    }
    private static void countAlphaNumSplChars(String inputStr, char character){
        int characterCounter=0;
        for(char ch: inputStr.toCharArray()){
            if(ch==character){
                characterCounter++;
            }
        }
        System.out.println("Occurrences of character "+character+" in total: "+characterCounter);
    }
}
