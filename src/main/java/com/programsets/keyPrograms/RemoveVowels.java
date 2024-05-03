package com.programsets.keyPrograms;

import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        String inputStr = "tester is testing the test";
        Set<Character> vowelsList= Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        String resStr ="";
        for(char ch: inputStr.toCharArray()){
            if(!vowelsList.contains(ch)){
                resStr += ch;
            }
        }
        System.out.println(resStr);

    }
}
