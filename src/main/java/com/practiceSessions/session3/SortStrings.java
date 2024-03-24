package com.practiceSessions.session3;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        sortUsingBIM(inputStr);
        sortUsingNBIM(inputStr);
    }

    private static void sortUsingBIM(String inputStr){
        char[] charArray=inputStr.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        System.out.println("After Sorting(BIM): "+new String(charArray).trim());
    }

    private static void sortUsingNBIM(String inputStr){
        char[] charArray=inputStr.toLowerCase().toCharArray();

        for(int i=0; i<charArray.length; i++){
            for(int j=i+1; j<charArray.length; j++){
                if(charArray[i]>charArray[j]){
                    char temp=charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println("After Sorting(NBIM): "+new String(charArray).trim());

    }


}
