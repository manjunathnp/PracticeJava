package com.stringpgms;

import java.util.Scanner;

public class CharReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the character to replace: ");
        char charToReplace = sc.nextLine().charAt(0);

        System.out.println("Enter the replacement character: ");
        char replacementChar = sc.nextLine().charAt(0);

        String newStr = replaceCharacter(inputStr, charToReplace, replacementChar);
        System.out.println(newStr);
    }

    private static String replaceCharacter(String inputStr, char charToReplace, char replacementChar) {
        char[] charArray = inputStr.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(charArray[i]==charToReplace){
                charArray[i]=replacementChar;
            }
        }
        return new String(charArray);
    }
}
