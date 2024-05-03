package com.programsets.set2.Thu250424;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrencesOfAllCharacters {
    public static void main(String[] args) {
        String inputStr = "test automation";

        Map<Character, Integer> counterMap = new LinkedHashMap<>();

        for(char character: inputStr.toCharArray()){
            if(counterMap.containsKey(character)){
                counterMap.put(character, counterMap.get(character)+1);
            }else {
                counterMap.put(character, 1);
            }
        }

        for(Character character: counterMap.keySet()){
            if(character==' ') {
                System.out.println("Spaces: " + counterMap.get(character));
            }else {
                System.out.println(character+": " + counterMap.get(character));

            }

        }
    }
}
