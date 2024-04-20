package com.programsets.set3.Fri190424;

import java.util.regex.Pattern;

public class RemoveSpecificSubStr {
    public static void main(String[] args) {
        String str = "tester is testing";
        String subStr = "is";

        String resStr=str.replaceAll(subStr, "");
        System.out.println(resStr);

        String resStr2 = str.replaceAll("\\s"+ Pattern.quote(subStr) +"\\s", " ");
        System.out.println(resStr2);
    }
}
