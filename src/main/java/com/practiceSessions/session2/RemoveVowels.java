package com.practiceSessions.session2;

import java.util.Scanner;
import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        removeVowels(inputStr);
    }

    private static void removeVowels(String inputStr){
        String afterVowelsRemoval = "";
        Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for(char character: inputStr.toCharArray()){
            if(!vowelsSet.contains(character)){
                afterVowelsRemoval += character;
            }
        }
        System.out.println("After removal of vowels: "+afterVowelsRemoval);
    }
}
