package com.programsets.set1.Wed170424;

import java.util.Scanner;

public class CaseConversions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        caseConversionUpperToLower(inputStr);
        caseConversionLowerToUpper(inputStr);
    }
    private static void caseConversionUpperToLower(String inputStr){
        char[] charArray = inputStr.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='A' && charArray[i] <= 'Z'){
                charArray[i] += 32;
            }
        }

        System.out.println("Upper to Lower: "+new String(charArray));
    }

    private static void caseConversionLowerToUpper(String inputStr){
        char[] charArray = inputStr.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]>='a' && charArray[i]<='z'){
                charArray[i] -= 32;
            }
        }
        System.out.println("Lower to Upper: "+new String(charArray));
    }
}
