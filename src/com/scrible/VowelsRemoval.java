package com.scrible;

import java.util.Scanner;

public class VowelsRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = sc.nextLine();

        removeVowels(text);
    }
    public static void removeVowels(String text){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String withoutVowels = "";

        for(char ch: text.toCharArray()){
            boolean vowelPresence=false;
            for(char vowel: vowels){
                if(ch == vowel){
                    vowelPresence=true;
                    break;
                }
            }
            if(vowelPresence==false){
                withoutVowels = withoutVowels + ch;
            }
        }
        System.out.println("After removal of vowels: "+withoutVowels);
    }
}
