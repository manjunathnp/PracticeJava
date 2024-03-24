package com.practiceSessions.session2;

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

    private static void vowelsRemover(String inputStr){
        char[] charArray=inputStr.toLowerCase().toCharArray();

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'v');
        Set<Character> vowelsInInputStr = new LinkedHashSet<>();
        String resultantString = "";

        int vowelCounter = 0;

        for(char ch: charArray){
            if(vowels.contains(ch)){
                vowelCounter++;
                vowelsInInputStr.add(ch);
            }else{
                resultantString += ch;
            }
        }
        System.out.println("Total Vowels: "+vowelCounter);
        System.out.println("Vowels in Input String: "+vowelsInInputStr.toString());
        System.out.println("String without vowels: "+resultantString);
    }
}
