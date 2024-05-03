package com.programsets.set3.Fri260424;

import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        String input = "input string";
        Set<Character> vowels= Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        StringBuilder resStr = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(!vowels.contains(ch)){
                resStr.append(ch);
            }
        }
        System.out.println(resStr);
    }
}
