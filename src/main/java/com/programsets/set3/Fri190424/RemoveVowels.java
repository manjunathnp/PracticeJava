package com.programsets.set3.Fri190424;

import java.util.Scanner;
import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.next();

        removeVowels(inputStr);
    }
    private static void removeVowels(String inputStr){
        char[] charArray=inputStr.toCharArray();
        String resStr="";
        Set<Character>vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for(char character: charArray){
            if(!vowels.contains(character)){
                resStr += character;
            }
        }
        System.out.println("After removing vowels: "+resStr);
    }
}
