package com.programsets.set2.Thu180424;

public class LengthOfStr {
    public static void main(String[] args) {
        String str = "this is test string";

        System.out.println("In-built method : "+str.length());

        int charCounter=0;
        for(char character:str.toCharArray())
        {
            charCounter++;
        }
        System.out.println("Length of string: "+charCounter);
    }
}
