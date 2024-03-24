package com.stringpgms;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        System.out.println("Using built-in method: "+str1.concat(str2));
        System.out.println(concatenateStrings(str1, str2));
    }
    private static String concatenateStrings(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int totalLength = charArray1.length + charArray2.length;
        char[] resultArray = new char[totalLength];

        int i = 0;
        for (char c : charArray1) {
            resultArray[i++] = c;

        }
        for (char c : charArray2) {
            resultArray[i++] = c;
        }

        return new String(resultArray);
    }
}
