package com.programsets.set3.Fri260424;

import com.concepts.C;

public class Capitalization {
    public static void main(String[] args) {
        String inputStr = "testing done by tester";
        char[] charArray = inputStr.toCharArray();

        for(int i=0; i<charArray.length; i++){
            charArray[0] = Character.toUpperCase(charArray[0]);
        }

        for(int i=1; i<charArray.length; i++){
            if(charArray[i-1]==' '){
                charArray[i]= Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println("Capitalized: "+new String(charArray));
    }
}
