package com.scrible;

public class ReverseTextTest {
    public static void main(String[] args) {
        String str = "Hello";
        String origStr = str;

        System.out.println("Original String: "+origStr);
//        StringBuffer sb = new StringBuffer(String.valueOf(str));
//        StringBuilder sb = new StringBuilder(String.valueOf(str));
//        System.out.println("Reverse: "+sb.reverse());

        String revStr="";
        for(int i=str.length()-1; i>=0; i--){
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Reversed String: "+revStr);

    }
}
