package com.scrible;

import java.util.Scanner;

public class FibonacciTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();

        generateFibonacci(limit);
    }

    private static void generateFibonacci(int limit) {
        int n1=0, n2=1, sum=0;
        for(int i=1; i<=limit; i++){
            System.out.print(n1+" ");      // 0     1
            sum = n1+n2;                    //1    2
            n2 = n1;                    //n2=1     1
            n1 = sum;                   //n1=1     2
        }
    }
}
