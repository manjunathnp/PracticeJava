package com.programsets.set1.Mon220424;

public class CaseConversion {
    public static void main(String[] args) {
        String inputStr = "this is test string";

        char[] charArray = inputStr.toCharArray();
        for(int i=0; i<inputStr.length(); i++){
            if(charArray[i]>='a' && charArray[i]<='z'){
                charArray[i]-=32;
            }
        }
        System.out.println("Lower to Upper: "+new String(charArray));

        for(int i=0; i<inputStr.length(); i++){
            if(charArray[i]>='A' && charArray[i]<='Z'){
                charArray[i]+=32;
            }
        }
        System.out.println("Upper to Lower: "+new String(charArray));
    }
}
