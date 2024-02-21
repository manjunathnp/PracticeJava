package com.misc;

public class Session2 {
    public static void main(String[] args) {
        String alphaNumSplChars = "[0-9a-zA-Z!@#$%^&*()_+-]";
        StringBuilder sbl = new StringBuilder();

        for (char ch : alphaNumSplChars.toCharArray()) {
            sbl.append(ch);
        }

        String randomString = sbl.toString();
        System.out.println("Random String:\n" + randomString);

    }
}
