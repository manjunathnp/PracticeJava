package com.programsets.keyPrograms;

public class ReplaceSpecificChar {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        char ch = 't';

        String resStr=inputStr.replaceAll(String.valueOf(ch), "");
        System.out.println(resStr);
    }
}
