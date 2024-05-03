package com.programsets.set2.Thu250424;

public class StringPalindrome {
    public static void main(String[] args) {
        String inputStr = "madam";

        String origStr = inputStr;
        String revStr = "";
        for(int i=inputStr.length()-1; i>=0; i--){
            revStr = revStr + inputStr.charAt(i);
        }
        System.out.println("Reversed String: "+revStr);
        if(revStr.equalsIgnoreCase(origStr)){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }
    }
}
