package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class RootFinders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        sqaureRootOf(num);
    }

    private static void sqaureRootOf(int num){
        for(int i=1; i<=num; i++){
            if(num == i*i){
                System.out.println("Square Root of "+num+" = "+i);
            }
        }
    }
}
