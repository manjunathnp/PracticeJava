package com.programsets.keyPrograms;

public class WordReversal {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        String[] words = inputStr.split("\\s");

        String revStr = "";
        for(int i=words.length-1; i>=0; i--){
            revStr += words[i]+" ";
        }
        System.out.println(revStr);

        StringBuilder reversedString = new StringBuilder();
        for(String revWord: revStr.split("\\s")){
            for(int i=revWord.length()-1; i>=0; i--){
                reversedString.append(revWord.charAt(i));
            }
            reversedString.append(" ");
        }
        System.out.println(reversedString);
    }

}
