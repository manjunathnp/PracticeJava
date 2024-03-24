package com.practiceSessions.session1;

import java.util.Scanner;

public class WordsReversal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        wordsReversal(inputStr);
    }

    private static void wordsReversal(String inputStr) {
        String[] words=inputStr.split("\s");
        StringBuilder revStr = new StringBuilder();

        for(int i= words.length-1; i>=0; i--){
            revStr.append(words[i]+" ");
        }

        String[] revWords = revStr.toString().split("\s+");
        //StringBuilder reversedWords = new StringBuilder();
        String reversedWords="";
        for(String word: revWords){
            for(int i=word.length()-1; i>=0; i--){
                //reversedWords.append(word.charAt(i));
                reversedWords+= word.charAt(i);
            }
            reversedWords+=" ";
            //reversedWords.append(" ")
;        }
        System.out.println("Reversed Words: "+reversedWords);
    }
}

/*  test testing
*   testing test
*   gnitset tset
* */
