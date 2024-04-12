package com.practiceSessions.general;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountAllCharacterOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        countAllCharacterOccurrences(inputStr);
    }

    private static void countAllCharacterOccurrences(String inputStr){
        Map<Character, Integer> counterMap = new LinkedHashMap<>();
        char[] charArray = inputStr.toCharArray();

        for(char character: charArray){
            if(counterMap.containsKey(character)){
                counterMap.put(character, counterMap.get(character)+1);
            }else{
                counterMap.put(character, 1);
            }
        }

        for(Character character: counterMap.keySet()){
            if(character==' '){
                System.out.println("Spaces: "+counterMap.get(character));
            }else{
                System.out.println(character+": "+counterMap.get(character));

            }
        }
    }
}
