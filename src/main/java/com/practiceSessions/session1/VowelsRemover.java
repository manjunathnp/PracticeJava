package com.practiceSessions.session1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelsRemover {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        vowelsRemover(inputStr);
    }

    private static void vowelsRemover(String inputStr) {
        char[] charArray=inputStr.toLowerCase().toCharArray();
        int vowelCount=0;
        String resultantString="";

        Set<Character> vowels=Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> uniqueVowels = new LinkedHashSet<>();

        for(char ch: charArray){
            if(vowels.contains(ch)){
                vowelCount++;
                uniqueVowels.add(ch);
            }else {
                resultantString += ch;
            }
        }
        System.out.println("Total vowels: "+vowelCount);
        System.out.println("Vowels: "+uniqueVowels.toString());
        System.out.println("String without Vowels: "+resultantString);
    }
}
