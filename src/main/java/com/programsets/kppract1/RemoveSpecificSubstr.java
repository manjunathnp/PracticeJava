package com.programsets.kppract1;

public class RemoveSpecificSubstr {
    public static void main(String[] args) {
        String inputStr = "tester is testing the test";
        String subStr = "test";

        String resultantStr=inputStr.replaceAll(subStr, "");
        System.out.println("Resultant String: "+resultantStr);
    }
}
