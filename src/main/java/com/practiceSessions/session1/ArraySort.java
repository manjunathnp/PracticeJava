package com.practiceSessions.session1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] num = new int[size];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            num[i] = scanner.nextInt();
        }

        //ascendingOrderSort(num);
        //ascendingOrderSortCustom(num);

        //descendingOrderSort(num);
        descendingOrderSortCustom(num);
    }

    private static void descendingOrderSortCustom(int[] num) {
        System.out.println("DESCENDING ORDER SORT:\nArray Before Sorting: "+Arrays.toString(num));
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]<num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("Array After Sorting: ");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }


    }

    private static void descendingOrderSort(int[] num) {
        Integer[] number = new Integer[num.length];
        for(int i=0; i<number.length; i++){
            number[i]=num[i];
        }
        System.out.println("DESCENDING ORDER SORT:\nArray Before Sorting: "+Arrays.toString(number));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("Array After Sorting: "+Arrays.toString(number));

    }

    private static void ascendingOrderSortCustom(int[] num) {
        System.out.println("ASCENDING ORDER SORT:\nArray Before Sorting: "+Arrays.toString(num));
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Array After Sorting: ");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }

    private static void ascendingOrderSort(int[] num) {
        System.out.println("ASCENDING ORDER SORT:\nArray Before Sorting: "+Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Array After Sorting: "+Arrays.toString(num));

    }
}
