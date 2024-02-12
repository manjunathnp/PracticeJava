package com.misc;

public class HelloWorld {
    public static void main(String[] args) {
        String originalString = "Hello World!";
        StringBuilder stringBuilder = new StringBuilder(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + stringBuilder.reverse());
    }
}
