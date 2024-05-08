package com.programsets.kppract1;

public class WordReversal {
    public static void main(String[] args) {
        String str = "tester is testing";
        String[] words=str.split("\\s");

        String reversedSentence = "";
        for(int i= words.length-1; i>=0; i--){
            reversedSentence += words[i]+" ";
        }
        System.out.println(reversedSentence);

        String[] revWords=reversedSentence.split("\\s");

        StringBuilder resStr = new StringBuilder();
        for(String revWord: revWords){
            for(int i=revWord.length()-1; i>=0; i--){
                resStr.append(revWord.charAt(i));
            }
            resStr.append(" ");
        }
        System.out.println("Resultant String: "+resStr);
    }
}
