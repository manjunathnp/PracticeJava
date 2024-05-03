package com.programsets.set3.Fri260424;

public class WordReversalString {
    public static void main(String[] args) {
        String inputStr = "tester is testing";

        String[] words = inputStr.split("\\s");
        String revWords = "";
        for(int i=words.length-1; i>=0; i--){
            revWords += words[i]+" ";
        }
        System.out.println("Reversed Words: \n"+revWords);

        String[] reversedWords = revWords.split("\\s");
        StringBuilder revStr = new StringBuilder();
        for(String word: reversedWords){
            for(int i=word.length()-1; i>=0; i--){
                revStr.append(word.charAt(i));
            }
            revStr.append(" ");
        }
        System.out.println("\nReversed String: \n"+revStr);
    }
}
