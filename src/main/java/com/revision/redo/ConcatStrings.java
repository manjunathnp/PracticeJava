package com.revision.redo;

public class ConcatStrings {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "string";

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int strLen = charArray1.length+charArray2.length;
        char[] resStr = new char[strLen];

        int i=0;
        for(char character: charArray1){
            resStr[i++]=character;
        }
        for(char character: charArray2){
            resStr[i++]=character;
        }
        System.out.println("Resultant String: "+new String(resStr));
    }
}
