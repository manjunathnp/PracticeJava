package com.practiceSessions.session2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        countCharOccurrences(inputStr);
    }

    private static void countCharOccurrences(String inputStr) {
        char[] charArray=inputStr.toCharArray();
        Map<Character, Integer> mapCounter = new HashMap<>();

        for(char ch: charArray){
            if(mapCounter.containsKey(ch)){
                mapCounter.put(ch, mapCounter.get(ch)+1);
            }else{
                mapCounter.put(ch, 1);
            }
        }
        for(Character ch: mapCounter.keySet()){
            if(ch==' ')
                System.out.println("Spaces: "+mapCounter.get(ch));
            else
                System.out.println(ch+": "+mapCounter.get(ch));
        }
    }
}
