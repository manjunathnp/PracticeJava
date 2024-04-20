package com.programsets.set1.Wed170424;

public class ConcatStrings {
    public static void main(String[] args) {
        String str1 = "tester";
        String str2 = "testing";

        System.out.println(str1.concat(str2));

        customConcat(str1, str2);
    }
    private static void customConcat(String str1, String str2){
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        char[] resArray = new char[charArray1.length+charArray2.length];

        int i=0;
        for(char character: charArray1){
            resArray[i++] = character;
        }

        for(char character: charArray2){
            resArray[i++] = character;
        }

        System.out.println("String concat: "+new String(resArray));
    }
}
