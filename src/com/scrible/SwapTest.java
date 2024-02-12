package com.scrible;

public class SwapTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println("Before Swap:\n"+"n1: "+n1+": "+" n2: "+n2);

        /*int temp = n1;
        n1 = n2;
        n2 = temp;*/

        /*n1 = n1*n2;
        n2 = n1/n2;
        n1 = n1/n2;*/

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After Swap:\n"+"n2: "+n1+": "+" n2: "+n2);
    }



}
