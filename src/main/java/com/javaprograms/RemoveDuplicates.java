package com.javaprograms;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String inputStr = "SELENIUM";
        String resultantStr = "";

        for(int i=0; i<inputStr.length(); i++){
            if(resultantStr.indexOf(inputStr.charAt(i))==-1){
                resultantStr += inputStr.charAt(i);
            }
        }
        System.out.println(resultantStr);
    }

}
