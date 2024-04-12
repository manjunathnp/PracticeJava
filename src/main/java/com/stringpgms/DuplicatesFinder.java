package com.stringpgms;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicatesFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        duplicatesCharFinder(inputStr);
    }

    private static void duplicatesCharFinder(String inputStr) {
        char[] charArray = inputStr.toLowerCase().toCharArray();
        HashSet<Character> seenCharacters = new HashSet<>();
        HashSet<Character> duplicateCharacters = new HashSet<>();

        // Identify duplicates
        for (char c : charArray) {
            if (!seenCharacters.add(c)) { // add() returns false if the element was already in the set
                duplicateCharacters.add(c);
            }
        }

        // Print duplicates or indicate none were found
        if (!duplicateCharacters.isEmpty()) {
            System.out.println("Duplicates: ");
            for (char c : duplicateCharacters) {
                System.out.println(c);
            }
        } else {
            System.out.println("No Duplicates");
        }
    }
}
