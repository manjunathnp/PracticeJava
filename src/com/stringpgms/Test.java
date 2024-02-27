package com.stringpgms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String inputStr = "testing";
        char[] charArray = inputStr.toCharArray();

        Map<Character, Integer> mapCounter = new LinkedHashMap<>();

        for(char ch: charArray){
            if(mapCounter.containsKey(ch)){
                mapCounter.put(ch, mapCounter.get(ch)+1);
            }else{
                mapCounter.put(ch, 1);
            }
        }

        for(Character key: mapCounter.keySet()){
            System.out.println(key+": "+mapCounter.get(key));
        }
    }


}
