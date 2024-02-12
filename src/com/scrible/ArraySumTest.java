package com.scrible;

import java.util.Scanner;

public class ArraySumTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        sumOfArrayElements(size);

    }
    private static void sumOfArrayElements(int size){
        int a[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int sum=0;
        System.out.println("Sum of array elements: ");
        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
