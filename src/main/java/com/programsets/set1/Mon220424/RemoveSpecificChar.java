package com.programsets.set1.Mon220424;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        String inputStr = "this is test";
        char ch = 't';

        String resStr=inputStr.replaceAll(String.valueOf(ch), "");
        System.out.println(resStr);
    }


}
