package com.practiceSessions.stringPract;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inpStr = scanner.nextLine();

        System.out.println("Enter the character to remove: ");
        char ch = scanner.nextLine().charAt(0);

        removeSpecificChar(inpStr, ch);
    }

    private static void removeSpecificChar(String inpStr, char ch){
        char[] charArray=inpStr.toCharArray();
        String resStr = "";
        for(char character: charArray){
            if(character!=ch){
                resStr = resStr + character;
            }
        }
        System.out.println("Resultant String: "+resStr.trim());
    }
}
