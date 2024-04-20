package com.programsets.set3.Fri190424;

public class Conversions {
    public static void main(String[] args) {
        String str = "123";
        int convertedStrToNum=Integer.parseInt(str);
        System.out.println("Converted Str to Num: "+convertedStrToNum);

        int num = 123;
        String convertedNumToStr=String.valueOf(num);
        System.out.println("Converted Num to Str: "+convertedNumToStr);
    }
}
