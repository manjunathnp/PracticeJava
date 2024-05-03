package com.programsets.set1.Mon220424;

public class SwapNumbers {
    public static void main(String[] args) {
        int n1=10, n2=20;

        System.out.println("Before Swap: "+n1+" | "+n2);
        //logic-1
        /*int temp=n1;
        n1=n2;
        n2=temp;*/

        //logic-2
        /*n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;*/

        //logic-3
        n1 = n1*n2;
        n2 = n1/n2;
        n1 = n1/n2;
        System.out.println("After Swap: "+n1+" | "+n2);
    }
}
