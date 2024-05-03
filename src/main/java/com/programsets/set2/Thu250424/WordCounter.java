package com.programsets.set2.Thu250424;

public class WordCounter {
    public static void main(String[] args) {
        String inputStr = "tester is testing";

        String[] words=inputStr.split("\\s");
        System.out.println("Total Words: "+words.length);
    }
}
