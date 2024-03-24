package com.stringpgms;

import java.util.*;

public class CountEachCharOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputStr = scanner.nextLine();

        countEachChar(inputStr);
    }
    private static void countEachChar(String inputStr){
        char[] charArray = inputStr.toCharArray();

        Map<Character, Integer> counterMap = new LinkedHashMap<>();

        for(char ch: charArray){
            if(counterMap.containsKey(ch)){
                counterMap.put(ch, counterMap.get(ch)+1);
            }else{
                counterMap.put(ch, 1);
            }
        }

        for(Character key: counterMap.keySet()){
            if(key==' '){
                System.out.println("Spaces: "+counterMap.get(key));
            }else{
                System.out.println(key+": "+counterMap.get(key));
            }

        }
    }
}
