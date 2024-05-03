package com.programsets.set3.Fri260424;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] num = {2, 3, 44, -1, 33};
        Integer[] number = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            number[i]=num[i];
        }
        System.out.println("[ASCENDING] ORDER SORT - BEFORE: "+Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("[ASCENDING] ORDER SORT - AFTER: "+Arrays.toString(num));

        System.out.println("\n[DESCENDING] ORDER SORT - BEFORE: "+Arrays.toString(number));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("[DESCENDING] ORDER SORT - AFTER: "+Arrays.toString(number));
    }
}
