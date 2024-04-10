package com.practiceSessions.stringPract;

import java.util.Scanner;
import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        removeVowels(inputStr);
    }

    private static void removeVowels(String inputStr){
        Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String resStr = "";
        for(char character: inputStr.toCharArray()){
            if(!vowelsSet.contains(character)){
                resStr += character;
            }
        }
        System.out.println("After Removal of Vowels: "+resStr);
    }

}
