package com.revision.session1;

import java.util.Scanner;

public class CheckAlphas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        checkAlphas(inputString);
    }

    private static void checkAlphas(String inputString) {
        if(inputString.isEmpty()){
            System.out.println("Empty String");
        }else if(inputString.matches("['a-zA-Z\s']+")){
            System.out.println("String has ONLY ALPHABETS");
        }else if(inputString.matches("['a-zA-Z0-9\s']+")){
            System.out.println("String is combination of ALPHA NUMERIC");
        }else{
            System.out.println("String is combination of ALPHA NUMERIC SPECIAL CHARACTERS");
        }
    }

}
