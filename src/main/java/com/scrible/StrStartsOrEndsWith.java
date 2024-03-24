package com.scrible;

public class StrStartsOrEndsWith {
    public static void main(String[] args) {
        String inputStr = "this is testing programs";
        String subStr = "programs";

        if(inputStr.startsWith(subStr)){
            System.out.println("String starts with "+subStr);
        }else if(inputStr.endsWith(subStr)){
            System.out.println("String ends with "+subStr);
        }else {
            System.out.println("Not starting or ending with substring");
        }
    }
}
