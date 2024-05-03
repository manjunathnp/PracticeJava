package com.programsets.set1.Mon220424;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String inputStr = "testing";

        String resStr="";

       for(int i=0; i<inputStr.length(); i++){
           if(resStr.indexOf(inputStr.charAt(i))==-1){
               resStr+=inputStr.charAt(i);
           }
       }
        System.out.println(resStr);
    }
}
