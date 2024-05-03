package com.programsets.set2.Thu250424;

public class CountSpecificCharacter {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        char character = 't';

        int characterCount=0;
        for(char ch: inputStr.toCharArray()){
            if(ch==character){
                characterCount++;
            }
        }
        System.out.println(characterCount);
    }
}
