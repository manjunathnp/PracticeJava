package com.programsets.set3.Fri260424;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CheckForAlphas {
    public static void main(String[] args) {
        String inputStr = "tester";
        char[] charArray = inputStr.toCharArray();

        if(inputStr.matches("[a-zA-Z\s]+")){
            System.out.println("Only Alphabets");
        }else {
            System.out.println("Non-Alphabets");
        }
    }
}
