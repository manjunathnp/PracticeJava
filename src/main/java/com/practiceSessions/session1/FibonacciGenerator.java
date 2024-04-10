package com.practiceSessions.session1;

import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        fibonacciGenerator(number);
    }

    private static void fibonacciGenerator(int number){
        int n1=0, n2=1, sum=0;

        for(int i=1; i<=number; i++){
            System.out.print(n1+" ");
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
