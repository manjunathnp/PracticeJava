package com.programsets.set3.Fri260424;

public class RemoveSpecificSubStr {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        String subStr = "test";

        String resStr=inputStr.replaceAll(subStr, "");
        System.out.println(resStr);

    }
}
