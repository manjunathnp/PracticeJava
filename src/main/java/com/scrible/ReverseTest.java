package com.scrible;

public class ReverseTest {
    public static void main(String[] args) {
        int num=123;
        int origNum=123;
        int rev=0;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Original Number: "+origNum);
        System.out.println("Reversed Number: "+rev);


    }
}
