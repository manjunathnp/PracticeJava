package com.programsets.set1.Mon220424.redo;

public class ValidateEmail {
    public static void main(String[] args) {
        String email = "tester@test.com";

        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if(atIndex>0 && dotIndex>atIndex && dotIndex<email.length()-1 && dotIndex-1!=atIndex){
            System.out.println("Valid Email");
        }else {
            System.out.println("Invalid Email");
        }

    }
}
