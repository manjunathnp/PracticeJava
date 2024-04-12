package com.practiceSessions.general;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        findDuplicates(inputStr);
    }

    private static void findDuplicates(String inputStr) {
        char[] charArray=inputStr.toCharArray();

        HashSet<Character>uniqueCharacters = new HashSet<>();
        HashSet<Character> duplicateCharacters = new HashSet<>();

        for(char character: charArray){
            if(!uniqueCharacters.add(character)){
                duplicateCharacters.add(character);
            }
        }

        if(duplicateCharacters.isEmpty()){
            System.out.println("No Duplicates!");
        }else{
            System.out.println("Duplicates: ");
            for(char character: duplicateCharacters){
                System.out.println(character);
            }
        }
    }
}
