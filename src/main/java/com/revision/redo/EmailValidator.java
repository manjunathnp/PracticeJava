package com.revision.redo;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the email: ");
        String email = scanner.next();

        emailValidator(email);
    }
    private static void emailValidator(String email){
        int atIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        if(atIndex>0 && atIndex < email.length() && dotIndex < email.length() && dotIndex>atIndex && dotIndex-1!=atIndex){
            System.out.println("Valid Email");
        }else {
            System.out.println("Invalid Email");
        }
    }
}
