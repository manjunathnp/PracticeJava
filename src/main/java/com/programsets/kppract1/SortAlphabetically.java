package com.programsets.kppract1;

public class SortAlphabetically {
    public static void main(String[] args) {
        String str = "tester";

        char[] charArray=str.toCharArray();

        for(int i=0; i<charArray.length; i++){
            for(int j=i+1; j<charArray.length; j++){
                if(charArray[i]>charArray[j]){
                    char temp = charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println("After Sorting: "+new String(charArray).trim());
    }
}
