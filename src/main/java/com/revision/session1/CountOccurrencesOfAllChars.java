package com.revision.session1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrencesOfAllChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        countOccurrencesOfAllChars(inputStr);
    }
    private static void countOccurrencesOfAllChars(String inputStr){
        Map<Character, Integer> counterMap = new LinkedHashMap<>();
        char[] charArray = inputStr.toCharArray();

        for(char ch: charArray){
            if(counterMap.containsKey(ch)){
                counterMap.put(ch, counterMap.get(ch)+1);
            }else {
                counterMap.put(ch, 1);
            }
        }
        for(Character character: counterMap.keySet()){
            System.out.println(character+": "+counterMap.get(character));
        }
    }
}
