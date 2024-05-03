package com.programsets.set3.Fri260424.redo;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] num = {2, 0, 1, 3, 4, 5};

        System.out.println("Before Sorting - Ascending order: "+Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("After Sorting - Ascending order: "+Arrays.toString(num));

        Integer[] number = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            number[i]=num[i];
        }

        System.out.println("\nBefore Sorting - Descending order: "+Arrays.toString(number));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("After Sorting - Descending order: "+Arrays.toString(number));
    }
}
