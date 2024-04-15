package com.revision.session1;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Enter the character to remove: ");
        char character = scanner.next().charAt(0);

        removeSpecificCharacter(inputStr, character);
    }

    private static void removeSpecificCharacter(String inputStr, char character){
        char[] charArray=inputStr.toCharArray();
        StringBuilder resStr = new StringBuilder();
        for(char ch: charArray){
            if(ch!=character){
                resStr.append(ch);
            }
        }
        System.out.println("Resultant String: "+resStr.toString());
    }
}
