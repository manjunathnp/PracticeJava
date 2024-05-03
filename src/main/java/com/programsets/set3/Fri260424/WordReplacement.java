package com.programsets.set3.Fri260424;

public class WordReplacement {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        String wordToReplace = "tester";
        String replacementWord = "automation engineer";

        String[] inputWords = inputStr.split("\\s");
        StringBuilder resStr = new StringBuilder();
        for(String word: inputWords){
            if(word.equals(wordToReplace)){
                resStr.append(replacementWord+" ");
            }else {
                resStr.append(word+" ");
            }
        }
        System.out.println("Resultant String: "+resStr.toString().trim());
    }
}
