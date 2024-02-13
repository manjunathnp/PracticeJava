package com.misc;

public class Test2 {
    public static void main(String[] args) {
        String inputStr = "This is test string";
        String[] words = inputStr.split("\s");

        String resultStr = "";
        for(int i=words.length-1; i>=0; i--){
            resultStr = resultStr + words[i] + " ";
        }
        System.out.println(resultStr);
    }
}
