package com.programsets.kppract1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String str = "test123@test.com ";

        Map<Character, Integer> mapCounter = new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            if(mapCounter.containsKey(ch)){
                mapCounter.put(ch, mapCounter.get(ch)+1);
            }else {
                mapCounter.put(ch, 1);
            }
        }

        for(Character character: mapCounter.keySet()){
            if(character=='\s'){
                System.out.println("Spaces: "+mapCounter.get(character));
            }else {
                System.out.println(character+": "+mapCounter.get(character));
            }
        }
    }
}
