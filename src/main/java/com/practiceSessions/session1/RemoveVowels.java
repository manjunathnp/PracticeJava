package com.practiceSessions.session1;

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
        String resStr = "";
        Set<Character> vowelsSet = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        for(char character: inputStr.toCharArray()){
            if(!vowelsSet.contains(character)){
                resStr = resStr+character;
            }
        }
        System.out.println("After removal of vowels: "+resStr);
    }
}
