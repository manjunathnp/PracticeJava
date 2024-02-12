package com.scrible;

public class ReverseWords {
    public static void main(String[] args) {
        String inputStr = "Hello world";
        String origStr = inputStr;

        System.out.println("Original String: "+origStr);
        reverseWords(inputStr);
        reverseCharsInWords(inputStr);
    }

    private static void reverseCharsInWords(String inputStr) {
        String[] words = inputStr.split(" ");

        String revWords = "";
        String revSentence = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            revSentence += reversedWord + " ";
        }
        System.out.println("Reversed character in words in a string: "+revSentence.trim());
    }

    private static void reverseWords(String inputStr) {
        String[] words = inputStr.split(" ");
        String revWords = "";

        for(int i=words.length-1; i>=0; i--){
            revWords = revWords + words[i]+" ";
        }
        System.out.println("Reversed words in a string: "+revWords.trim());
    }
}
