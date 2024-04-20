package com.programsets.set1.Wed170424;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the num2: ");
        int n2 = scanner.nextInt();

        swapNumbers(n1, n2);
    }
    private static void swapNumbers(int n1, int n2){
        System.out.println("Before Swap: "+n1+" | "+n2);
        //logic-1
        /*int temp = n1;
        n1 = n2;
        n2 = temp;*/

        //Logic-2
        /*n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;*/

        //Logic-3
        n1 = n1*n2;
        n2 = n1/n2;
        n1 = n1/n2;
        System.out.println("After Swap: "+n1+" | "+n2);
    }
}
