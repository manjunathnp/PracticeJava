package com.revision.session1;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total no. of numbers: ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the numbers: ");
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }

        arrayMaxMin(a);
    }
    private static void arrayMaxMin(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum: "+max);

        int min=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum: "+min);
    }
}
