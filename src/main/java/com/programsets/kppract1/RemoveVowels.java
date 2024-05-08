package com.programsets.kppract1;

import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        String inputStr = "tester is testing";

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] charArray=inputStr.toCharArray();
        String resStr="";
        for(char ch: charArray){
            if(!vowels.contains(ch)){
                resStr += ch;
            }
        }
        System.out.println("Resultant String: "+resStr);
    }
}
