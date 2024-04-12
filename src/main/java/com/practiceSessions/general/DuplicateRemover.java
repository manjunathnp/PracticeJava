package com.practiceSessions.general;

import java.util.Scanner;

public class DuplicateRemover{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        duplicateRemover(inputStr);
    }

    private static void duplicateRemover(String inputStr){
        String resStr="";

        for(int i=0; i<inputStr.length(); i++){
            if(resStr.indexOf(inputStr.charAt(i))==-1){
                resStr += inputStr.charAt(i);
            }
        }
        System.out.println("After removal of duplicates: \n"+resStr);
    }
}
