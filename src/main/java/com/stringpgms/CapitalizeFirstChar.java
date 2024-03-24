package com.stringpgms;

public class CapitalizeFirstChar {
    public static void main(String[] args) {
        String inputStr = "this is input string";

        char[] charArray = inputStr.toCharArray();

        for(char ch: charArray){
            charArray[0] = Character.toUpperCase(charArray[0]);
        }

        for (int i=1; i<charArray.length; i++){
            if(charArray[i-1]==' '){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println("Capitalized String: "+new String(charArray));

    }
}
