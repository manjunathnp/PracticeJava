package com.revision.session1;

import java.util.Scanner;

public class RootFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        rootOf(num);
    }

    private static void rootOf(int num){
        for(int i=1; i<=num; i++){
            if(i*i==num){
                System.out.println("Square root of "+num+" = "+i);
            }
        }
    }
}

