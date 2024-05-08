package com.programsets.kppract1;

import java.util.Arrays;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "tester";
        String str2 = "testing";

        /*String resStr = str1+str2;
        System.out.println(resStr);*/

        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();

        char[] resArray = new char[charArray1.length+charArray2.length];

        int i=0;
        for(char ch: charArray1){
            resArray[i++]=ch;
        }

        for(char ch: charArray2){
            resArray[i++]=ch;
        }

        System.out.println("Concatenated String: "+ new String(resArray));
    }
}
