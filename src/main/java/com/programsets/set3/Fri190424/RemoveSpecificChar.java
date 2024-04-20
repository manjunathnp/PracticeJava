package com.programsets.set3.Fri190424;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        String str = "testing";
        char ch = 't';

        char[] charArray=str.toCharArray();
        String resStr="";
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]!=ch){
                resStr+=charArray[i];
            }
        }
        System.out.println(resStr); //esing
    }
}
