package com.practiceSessions.stringPract;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string1:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the input string2:");
        String str2 = scanner.nextLine();

        System.out.println("Using built-in method: "+str1.concat(str2));
        System.out.println("Using custom method: "+customConcat(str1, str2));

    }

    private static String customConcat(String str1, String str2) {
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();

        int arrayLen = charArray1.length+charArray2.length;
        char[] strArray = new char[arrayLen];

        int i=0;
        for(char character: charArray1){
            strArray[i++]=character;
        }

        for(char character: charArray2){
            strArray[i++]=character;
        }

        return new String(strArray);
    }
}
