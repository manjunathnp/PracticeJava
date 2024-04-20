package com.revision.session3;

public class StrCaseConversion {
    public static void main(String[] args) {
        String inputStr = "Test Automation";

        char[] charArray = inputStr.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(charArray[i] >='a' && charArray[i] <= 'z'){
                charArray[i] -= 32;
            }
        }
        System.out.println("Lower to Uppercase: "+new String(charArray));

        for(int i=0; i<charArray.length; i++){
            if(charArray[i] >= 'A' && charArray[i] <= 'Z'){
                charArray[i] += 32;
            }
        }

        System.out.println("Upper to Lowercase: "+new String(charArray));
    }
}
