package com.practice;

import java.util.Scanner;

public class Z5_Remove_Specific_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input String: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the character to remove: ");
        char character = sc.next().charAt(0);

        removeCharFromStr(inputStr, character);
    }
    public static void removeCharFromStr(String inputStr, char character){
        String stringWithoutSpecificLetter="";

        for(char ch: inputStr.toCharArray()){
            if(ch != character){
                stringWithoutSpecificLetter += ch;
            }

        }
        System.out.println(stringWithoutSpecificLetter);

    }
}
