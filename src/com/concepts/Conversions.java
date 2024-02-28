package com.concepts;

public class Conversions {
    public static void main(String[] args) {
        int num = 100;
        String snum = "1000";
        Integer intNum = 10;

        //convert int to String
        String intToStr=String.valueOf(num);
        System.out.println("int to String: "+intToStr);

        //String to int
        int StringToint = Integer.parseInt(snum);
        System.out.println("String to Integer: "+StringToint);

        /* Integer to int */
        int IntegerToint = intNum.intValue();
        System.out.println("Integer to int: "+IntegerToint);
    }
}
