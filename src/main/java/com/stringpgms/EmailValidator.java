package com.stringpgms;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        int atSymbolIndex = email.indexOf('@');
        int dotSymbolIndex = email.lastIndexOf('.');
        return atSymbolIndex > 0 && dotSymbolIndex > atSymbolIndex
                && dotSymbolIndex < email.length() - 1;
    }
    public static void main(String[] args) {
        String email = "example@example.xyz";
        boolean isValid = isValidEmail(email);
        System.out.println("Is valid email? " + isValid);
    }
}
