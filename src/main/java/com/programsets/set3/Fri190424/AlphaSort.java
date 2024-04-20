package com.programsets.set3.Fri190424;

import java.util.Arrays;
import java.util.Scanner;

public class AlphaSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        alphaSort(inputStr);
    }

    private static void alphaSort(String inputStr){
        char[] charArray = inputStr.toCharArray();
        Arrays.sort(charArray);
        System.out.println("Inbuilt Method Sorting: "+new String(charArray));

        for(int i=0; i<charArray.length; i++){
            for(int j=i+1; j<charArray.length; j++){
                if(charArray[i]>charArray[j]){
                    char temp = charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println("Custom Method Sorting: "+new String(charArray));
    }
}
