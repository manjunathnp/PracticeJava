package com.scrible;

import java.util.Scanner;

public class ArraySumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }

        System.out.println("Sum of array elements: "+sum);

        int eCount=0, eSum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                eCount++;
                eSum += a[i];
            }

        }
        System.out.println("Even sum: "+eSum);

        int oCount=0, oSum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2!=0){
                oCount++;
                oSum += a[i];
            }

        }
        System.out.println("Odd sum: "+oSum);
    }
}
