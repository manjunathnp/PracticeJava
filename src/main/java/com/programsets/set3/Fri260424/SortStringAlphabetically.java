package com.programsets.set3.Fri260424;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        char[] charArray = inputStr.toCharArray();
        for(int i=0; i<charArray.length; i++){
            for(int j=i+1; j<charArray.length; j++){
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
