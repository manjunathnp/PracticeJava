package com.programsets.set2.Thu250424;

public class StringReversalWords {
    public static void main(String[] args) {
        String inputStr = "tester is testing";

        String[] words = inputStr.split("\\s");
        String revWords = "";
        for(int i=words.length-1; i>=0; i--){
            revWords += words[i]+" ";
        }
        System.out.println(revWords);
    }
}
