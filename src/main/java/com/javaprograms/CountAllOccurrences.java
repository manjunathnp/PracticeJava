package com.javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountAllOccurrences {
    public static void main(String[] args) {
        String str = "testing";

        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }else{
                hashMap.put(ch, 1);
            }
        }

        for(Character ch: hashMap.keySet()){
            System.out.println(ch +":"+hashMap.get(ch));
        }
    }
}
