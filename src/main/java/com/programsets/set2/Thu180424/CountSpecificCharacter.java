package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class CountSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the specific character: ");
        char specificChar = scanner.next().charAt(0);

        countSpecificCharacter(inputStr, specificChar);
    }
    private static void countSpecificCharacter(String inputStr, char specificChar){
        int charCounter=0;
        for(char character: inputStr.toCharArray()){
            if(character==specificChar){
                charCounter++;
            }
        }
        System.out.println("Character Counter: "+charCounter);
    }
}
