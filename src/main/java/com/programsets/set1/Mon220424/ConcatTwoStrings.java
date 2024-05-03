package com.programsets.set1.Mon220424;

public class ConcatTwoStrings {
    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Automation";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        char[] resStr = new char[c1.length+c2.length];

        int i=0;
        for(char ch: c1){
            resStr[i++] = ch;
        }

        for(char ch: c2){
            resStr[i++] = ch;
        }
        System.out.println(new String(resStr));
    }
}
