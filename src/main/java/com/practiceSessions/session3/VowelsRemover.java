package com.practiceSessions.session3;

import java.util.Scanner;
import java.util.Set;

public class VowelsRemover {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        vowelsRemover(inputStr);
    }

    static void vowelsRemover(String inputStr){
        char[] charArray=inputStr.toLowerCase().toCharArray();
        String resStr = "";
        Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u');

        for(char ch: charArray){
            if(!vowelsSet.contains(ch)){
                resStr += ch;
            }
        }
        System.out.println("After vowels removal: "+resStr);
    }
}
