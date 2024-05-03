package com.programsets.keyPrograms;

public class CaseConversion {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        char[] charArray = inputStr.toCharArray();

        String resStr = "";
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='a' && charArray[i]<='z'){
                charArray[i] -= 32;
            }
        }
        System.out.println("Lower to Upper: "+new String(charArray));

        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='A' && charArray[i]<='Z'){
                charArray[i] += 32;
            }
        }
        System.out.println("Upper to Lower: "+new String(charArray));

    }
}
