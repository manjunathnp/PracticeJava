package com.javaprograms;

public class StringLength {
    public static void main(String[] args) {
        String str = "testing";

        char[] charArray = str.toCharArray();

        int count=0;
        for(char ch: charArray){
            if(ch != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
