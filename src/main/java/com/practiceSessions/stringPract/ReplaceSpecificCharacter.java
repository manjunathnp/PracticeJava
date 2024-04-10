package com.practiceSessions.stringPract;

import java.util.Scanner;

public class ReplaceSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the character to be removed from input string: ");
        char ch = scanner.nextLine().charAt(0);

        removeCharFromStr(inputStr, ch);
    }

    private static void removeCharFromStr(String inputStr, char ch){
        String resStr = inputStr.replaceAll(String.valueOf(ch), "");
        System.out.println("After character replacement: "+resStr);
    }
}
