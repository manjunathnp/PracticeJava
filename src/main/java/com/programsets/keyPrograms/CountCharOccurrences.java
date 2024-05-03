package com.programsets.keyPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharOccurrences {
    public static void main(String[] args) {
        String str = "test123 is @Test1";

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            if(countMap.containsKey(ch)){
                countMap.put(ch, countMap.get(ch)+1);
            }else {
                countMap.put(ch, 1);
            }
        }

        for(Character character: countMap.keySet()){
            if(character=='\s'){
                System.out.println("Spaces: "+countMap.get(character));
            }else {
                System.out.println(character+": "+countMap.get(character));
            }

        }
    }
}
