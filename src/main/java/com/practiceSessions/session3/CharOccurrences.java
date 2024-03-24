package com.practiceSessions.session3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        countCharOccurrences(inputStr);
    }

    private static void countCharOccurrences(String inputStr){
        char[] charArray=inputStr.toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();

        for(char ch: charArray){
            if(charCounter.containsKey(ch)){
                charCounter.put(ch, charCounter.get(ch)+1);
            }else{
                charCounter.put(ch, 1);
            }
        }
        for(Character ch: charCounter.keySet()){
            if(ch == ' '){
                System.out.println("Spaces: "+charCounter.get(ch));
            }else{
                System.out.println(ch+": "+charCounter.get(ch));
            }
        }
    }
}
