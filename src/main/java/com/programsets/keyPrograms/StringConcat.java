package com.programsets.keyPrograms;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "tester";
        String str2 = "testing";

        char[] resStr = new char[str1.length()+str2.length()];

        int i=0;
        for(char ch: str1.toCharArray()){
            resStr[i++]=ch;
        }
        for(char ch: str2.toCharArray()){
            resStr[i++]=ch;
        }

        System.out.println(new String(resStr));
    }
}
