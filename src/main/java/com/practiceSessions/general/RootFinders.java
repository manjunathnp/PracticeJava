package com.practiceSessions.general;

import java.util.Scanner;

public class RootFinders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        //squareRootOf(number);
        customSquareRootOf(number);
    }

    private static void customSquareRootOf(int number) {
        for(int i=1; i<=number; i++){
            if(i*i == number){
                System.out.println("Square Root of "+number+" = "+i);
            }
        }
    }

    private static void squareRootOf(int number) {
        System.out.println("Square Root of "+number+" = "+Math.sqrt(number));
    }
}
