package com.programsets.kppract1;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "tester@test.in";

        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if(atIndex > 0 && dotIndex > atIndex && dotIndex-1!=atIndex && dotIndex < email.length()){
            System.out.println("Valid Email");
        }else {
            System.out.println("Invalid Email");
        }
    }
}
