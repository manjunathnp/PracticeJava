package com.revision.session1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total no. of numbers: ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the numbers: ");
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }

        arraySum(a);
    }
    private static void arraySum(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Array Sum: "+sum);
    }
}
