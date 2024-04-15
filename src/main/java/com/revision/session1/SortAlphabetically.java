package com.revision.session1;

import java.util.Scanner;

public class SortAlphabetically {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        sortAlphabetically(inputStr);
    }
    private static void sortAlphabetically(String inputStr){
        char[] charArray = inputStr.toLowerCase().toCharArray();

        for(int i=0; i<charArray.length; i++){
            for(int j=i+1; j<charArray.length; j++){
                if(charArray[i]>charArray[j]){
                    char temp = charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println("Sorted Alphabetically: "+new String(charArray).trim());
    }
}
