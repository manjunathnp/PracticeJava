package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class WordReversalString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr=scanner.nextLine();

        wordReversalString(inputStr);
    }
    private static void wordReversalString(String inputStr){
        String[] words = inputStr.split("\s+");
        StringBuilder revStr = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            revStr.append(words[i]+" ");
        }
        System.out.println(revStr);
    }
}
