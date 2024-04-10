package com.practiceSessions.stringPract;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        System.out.println("Enter the character: ");
        char ch = scanner.nextLine().charAt(0);

        countCharOccurrences(str);
    }

    private static void countCharOccurrences(String str){
        Map<Character, Integer> mapCounter = new LinkedHashMap<>();

        char[] charArray = str.toCharArray();

        for(char character: charArray){
            if(mapCounter.containsKey(character)){
                mapCounter.put(character, mapCounter.get(character)+1);
            }else{
                mapCounter.put(character, 1);
            }
        }

        for(Character key: mapCounter.keySet()){
            if(key==' '){
                System.out.println("Spaces: "+mapCounter.get(key));
            }else{
                System.out.println(key+": "+mapCounter.get(key));
            }
        }
    }
}
