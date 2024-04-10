package com.practiceSessions.stringPract;

import java.util.Scanner;

public class CaseConversions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the stirng: ");
        String inputStr = scanner.nextLine();

        caseConversion(inputStr);
    }

    private static void caseConversion(String inputStr) {
        char[] charArray=inputStr.toCharArray();

        //To Uppercase
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='a' && charArray[i]<='z'){
                charArray[i] -= 32;
            }
        }
        System.out.println("To Uppercase: "+new String(charArray));

        //To Lowercase
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] >= 'A' && charArray[i]<='Z'){
                charArray[i] += 32;
            }
        }
        System.out.println("To Lowercase: "+new String(charArray));
    }
}
