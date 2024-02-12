package com.practice;

public class Z4_Remove_Vowels {

    public static String removeVowels(String text) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String result = ""; // Empty string for building the output

        for (char ch : text.toCharArray()) {
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (ch == vowel) {
                    isVowel = true;
                    break; // No need to check further vowels
                }
            }
            if (!isVowel) {
                result += ch; // Append non-vowels to the output string
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "This is a string with vowels.";
        String noVowels = removeVowels(text);
        System.out.println("Original text: " + text);
        System.out.println("Text without vowels: " + noVowels);
    }
}

