package com.scrible;

import java.util.Scanner;

public class EvenOddTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        checkEvenOdd(num);
    }

    private static void checkEvenOdd(int num){
        if(num%2 == 0) System.out.println(num+" is EVEN NUMBER");
        else System.out.println(num+" is ODD NUMBER");
    }

}
