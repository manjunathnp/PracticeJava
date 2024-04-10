package com.practiceSessions.general;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the num2: ");
        int num2 = scanner.nextInt();

        swapNumbers(num1, num2);
    }
    private static void swapNumbers(int num1, int num2){
        System.out.println("Before Swap: "+num1+" | "+num2);
        /*int temp = num1;
        num1 = num2;
        num2 = temp;*/

        /*num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;*/

        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;

        System.out.println("After Swap: "+num1+" | "+num2);
    }
}
