package com.programsets.set1.Wed170424;

public class SubStrIndexFinder {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        String subStr = "is";

        int subStrIndex = inputStr.indexOf(subStr);
        System.out.println("Substring index: "+subStrIndex);
    }
}
