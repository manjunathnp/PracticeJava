package com.scrible;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "Madam";
        String origStr = str;

        /*StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        String reversedStr = String.valueOf(stringBuilder.reverse());*/

        String reversedStr="";
        for(int i=str.length()-1; i>=0; i--){
            reversedStr = reversedStr + str.charAt(i);
        }

        if(reversedStr.equalsIgnoreCase(origStr)){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }

    }
}
