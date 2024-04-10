package com.practiceSessions.session2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<a.length; i++){
            a[i]=scanner.nextInt();
        }

        maximum(a);
        minimum(a);
    }
    private static void maximum(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum number: "+max);
    }

    private static void minimum(int[] a){
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Minimum number: "+min);
    }
}
