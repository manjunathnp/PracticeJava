package com.programsets.set3.Fri190424;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] a=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<a.length; i++){
            a[i]=scanner.nextInt();
        }

        maxMinValues(a);
    }
    private static void maxMinValues(int[] a){
        int min=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum Value: "+min);

        int max=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum Value: "+max);
    }
}
