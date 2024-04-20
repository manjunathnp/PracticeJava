package com.revision.session3;

public class SubStrIndexFinder {
    public static void main(String[] args) {
        String inputStr = "this is test string";
        String subStr = "test";

        int subStrIndex=inputStr.indexOf(subStr);
        System.out.println("Substring index: "+subStrIndex);
    }
}
