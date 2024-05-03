package com.programsets.keyPrograms;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "tester@test.com";

        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if(atIndex>0 && dotIndex>0 && dotIndex-1!=atIndex && dotIndex < email.length()-1){
            System.out.println("Valid Email");
        }else {
            System.out.println("Invalid Email");
        }
    }
}
