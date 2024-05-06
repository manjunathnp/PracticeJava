package com.programsets.kppract1;

public class AlphaCheck {
    public static void main(String[] args) {
        String inputStr = "tester is testing 123#";

        if(inputStr.matches("[a-zA-Z\s]+")){
            System.out.println("Alphabetical");
        }else if(inputStr.matches("[0-9\s]+")){
            System.out.println("Numerical");
        }else if(inputStr.matches("[0-9a-za-z\s]+")){
            System.out.println("AlphaNumerical");
        }else {
            System.out.println("AlphaNumericalSpecial");
        }
    }
}
