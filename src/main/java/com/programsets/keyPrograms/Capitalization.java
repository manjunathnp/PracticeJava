package com.programsets.keyPrograms;

public class Capitalization {
    public static void main(String[] args) {
        String str = "tester testing tests";
        char[] charArray = str.toCharArray();

        for(int i=0; i<charArray.length; i++){
            charArray[0] = Character.toUpperCase(charArray[0]);
        }

        for(int i=1; i<charArray.length; i++){
            if(charArray[i-1]==' '){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        System.out.println(new String(charArray));

    }
}
