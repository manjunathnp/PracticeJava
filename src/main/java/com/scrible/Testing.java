package com.scrible;

class WhiteSpaceRemover {
    public static void main(String[] args) {
        String text = "  This is a sample text   with white space.    ";
        String result = text.replaceAll("\\s", "");
        System.out.println(result);
    }
}
