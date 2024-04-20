package com.programsets.set1.Wed170424.redo;

public class CaseConversion {
    public static void main(String[] args) {
        String str = "this is test string";

        upperToLowerCase(str);
        lowerToUpperCase(str);
    }
    private static void upperToLowerCase(String str){
        char[] charArray=str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='A' && charArray[i] <='Z'){
                charArray[i] += 32;
            }
        }
        System.out.println("Upper to Lower: "+new String(charArray));
    }
    private static void lowerToUpperCase(String str){
        char[] charArray=str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='a' && charArray[i]<='z'){
                charArray[i]-=32;
            }
        }
        System.out.println("Lower to Upper: "+new String(charArray));
    }
}
