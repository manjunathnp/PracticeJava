package com.programsets.set2.Thu180424;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrencesOfAllCharsDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        countOccurrencesOfAllChar(inputStr);
    }
    private static void countOccurrencesOfAllChar(String inputStr){
        Map<Character, Integer> counterMap = new LinkedHashMap<>();

        for(char character: inputStr.toCharArray()){
            if(counterMap.containsKey(character)){
                counterMap.put(character, counterMap.get(character)+1);
            }else {
                counterMap.put(character, 1);
            }
        }

        for(Character character: counterMap.keySet()){
            System.out.println(character+": "+counterMap.get(character));
        }
    }
}
