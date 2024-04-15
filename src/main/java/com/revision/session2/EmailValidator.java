package com.revision.session2;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the email to validate: ");
        String emailID = scanner.nextLine();

        emailValidator(emailID);
    }
    private static void emailValidator(String emailID){
        int atIndex = emailID.indexOf('@');
        int dotIndex = emailID.lastIndexOf('.');

        if(atIndex > 0 && dotIndex > atIndex && dotIndex < emailID.length()-1 && dotIndex-1 != atIndex){
            System.out.println(emailID+" is VALID");
        }else{
            System.out.println(emailID+" is INVALID");
        }
    }
}
