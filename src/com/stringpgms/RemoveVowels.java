package com.stringpgms;

import java.util.Scanner;
import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        vowelsRemoval(inputStr);
    }

    private static void vowelsRemoval(String inputStr) {
        char[] characters = inputStr.toCharArray();

        String resultantStr = "";
        /*for(char ch: characters)
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                resultantStr += ch;
            }*/

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for(char ch: characters){
            if(!vowels.contains(ch)){
                resultantStr+= ch;
            }
        }
        System.out.println("After vowels removal: "+resultantStr);
    }
}
