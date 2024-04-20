package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<a.length; i++){
            a[i]=scanner.nextInt();
        }
        sumOfArray(a);
    }
    private static void sumOfArray(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of array: "+sum);
    }
}
