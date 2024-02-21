package com.misc;

public class Session4 {
    public static void main(String[] args) {
        String inputStr = "this is input string";

        reverseCompleteStr(inputStr);
    }

    private static void reverseCompleteStr(String inputStr) {
        String[] words = inputStr.split("\s");
        String resultantStr = "";
        String revWord ="";

        for(int i=words.length-1; i>=0; i--){
            for(String word: words){
                for(int j=word.length()-1; j>=0; j--){
                    revWord+=word.charAt(i);
                }
            }
            resultantStr += revWord +" ";
        }
        System.out.println(resultantStr);


    }
}
