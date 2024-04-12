package com.practiceSessions.general;

import java.util.Scanner;
import java.util.Set;

public class VowelsRemover {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        removeVowels(inputStr);
    }

    private static void removeVowels(String inputStr){
        char[] charArray=inputStr.toCharArray();

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String resStr = "";
        for(char ch: charArray){
            if(!vowels.contains(ch)){
                resStr += ch;
            }
        }
        System.out.println(resStr);
    }
}
