package com.programsets.set2.Thu250424;

public class LengthOfStr {
    public static void main(String[] args) {
        String inputStr = "tester is testing";

        char[] charArray=inputStr.toCharArray();
        int charCounter=0;
        for(char character: charArray){
            charCounter++;
        }
        System.out.println("Character Counter: "+charCounter);
    }
}
