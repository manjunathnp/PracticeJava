package com.scrible;

import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        
        convertUpperToLower(inputStr);
        convertLowerToUpper(inputStr);

    }

    private static void convertLowerToUpper(String inputStr) {
        char[] charArray=inputStr.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='a' && charArray[i]<='z'){
                charArray[i] -=32;
            }
        }
        System.out.println("Lower to Upper: "+new String(charArray));
    }

    private static void convertUpperToLower(String inputStr){
        char[] charArray=inputStr.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='A' && charArray[i]<='Z'){
                charArray[i] += 32;
            }
        }
        System.out.println("Upper to Lower: "+new String(charArray));
    }
}
