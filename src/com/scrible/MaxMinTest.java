package com.scrible;

import java.util.Scanner;

public class MaxMinTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for(int i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }

        int max=a[0];
        for(int i=0; i<size; i++){
            if(a[i]>max){
                max=a[i];

            }

        }
        System.out.println("Maximum value: "+max);

        int min=a[0];
        for(int i=0; i<size; i++){
            if(a[i]<min){
                min=a[i];

            }
        }
        System.out.println("Minimum value: "+min);

    }
}
