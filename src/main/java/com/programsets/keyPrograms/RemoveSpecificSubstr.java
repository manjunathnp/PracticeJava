package com.programsets.keyPrograms;

public class RemoveSpecificSubstr {
    public static void main(String[] args) {
        String inputStr = "tester is testing the test";
        String subStr = "test";

        String resStr = inputStr.replaceAll(subStr, "");
        System.out.println(resStr);
    }
}
