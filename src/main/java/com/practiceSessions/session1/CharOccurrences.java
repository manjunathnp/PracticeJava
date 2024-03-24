package com.practiceSessions.session1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        charOccurrencesCounter(inputStr);
    }

    private static void charOccurrencesCounter(String inputStr){
        char[] charArray=inputStr.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();

        for(char ch: charArray){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }else{
                hashMap.put(ch, 1);
            }
        }

        for(Character key: hashMap.keySet()){
            if(key==' '){
                System.out.println("Spaces: "+hashMap.get(key));
            }else {
                System.out.println(key+": "+hashMap.get(key));
            }
        }
    }
}
