package com.programsets.keyPrograms;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        String str = "tester";
        char ch = 't';
        String resStr = "";
        char[] charArray = str.toCharArray();
        for(char character: charArray){
            if(character!=ch){
                resStr+=character;
            }
        }
        System.out.println(resStr);
    }
}
