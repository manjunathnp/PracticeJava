package com.programsets.keyPrograms;

public class AlphaCheck {
    public static void main(String[] args) {
        String inputStr = "tester123@test";

        if(inputStr.matches("[a-zA-Z\s]+")){
            System.out.println("Alphabetical");
        }else if(inputStr.matches("[a-zA-Z0-9\s]+")){
            System.out.println("AlphaNumerical");
        }else {
            System.out.println("String with alpha numeric and spl characters");
        }
    }
}
