package com.practiceSessions.stringPract;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        //stringSort(inputStr.toLowerCase());
        stringSortUsingBM(inputStr);
    }

    private static void stringSortUsingBM(String inputStr){
        char[] charArray=inputStr.toCharArray();
        Arrays.sort(charArray);

        System.out.println("After sorting(Built-In, case-sensitive): "+new String(charArray).trim());
    }

    private static void stringSort(String inputStr) {
        /*char[] charArray=inputStr.toCharArray();
        Arrays.sort(charArray);
        System.out.println("After sorting: "+new String(charArray).trim());*/

        char[] charArray = inputStr.toCharArray();

        for(int i=0; i<charArray.length-1; i++){
            for(int j=i+1; j<charArray.length-1; j++){
                if(charArray[i]>charArray[j]){
                    char temp = charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println("After sorting: "+new String(charArray).trim());
    }
}
