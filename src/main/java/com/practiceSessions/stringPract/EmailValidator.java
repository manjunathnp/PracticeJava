package com.practiceSessions.stringPract;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String email = scanner.nextLine();

        emailValidator(email);
    }

    private static void emailValidator(String email) {
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if(atIndex>0 && dotIndex>atIndex && dotIndex<email.length()-1 && dotIndex-1!=atIndex){
            System.out.println("VALID EMAIL");
        }else {
            System.out.println("INVALID EMAIL FORMAT");
        }
    }
}
