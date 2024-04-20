package com.revision.session3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total numbers that you want to enter: ");
        int size = scanner.nextInt();
        System.out.println("Enter the numbers: ");

        int[] num = new int[size];
        for(int i=0; i<num.length; i++){
           num[i]=scanner.nextInt();
        }

        Integer[] number = new Integer[size];
        for(int i=0; i<number.length; i++){
            number[i]=num[i];
        }

        ascendingOrderSort(num);
        descendingOrderSort(number);
    }
    private static void ascendingOrderSort(int[] num){
        System.out.println("[ASCENDING ORDER]Before Sorting: "+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("[ASCENDING ORDER]After Sorting: "+Arrays.toString(num));
    }

    private static void descendingOrderSort(Integer[] number){
        System.out.println("[DESCENDING ORDER]Before Sorting: "+ Arrays.toString(number));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("[DESCENDING ORDER]After Sorting: "+Arrays.toString(number));
    }
}
