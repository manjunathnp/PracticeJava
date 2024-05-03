package com.programsets.set3.Fri260424.redo;

public class CheckAlphas {
    public static void main(String[] args) {
        String inputStr = "test string";

        if(inputStr.matches("[a-zA-Z\s]+")){
            System.out.println("Only Alphabets");
        }else {
            System.out.println("Non-Alphabets");
        }
    }
}
