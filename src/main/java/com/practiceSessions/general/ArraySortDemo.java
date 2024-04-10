package com.practiceSessions.general;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] num = {2, -2, 0, 1, 3};

        Arrays.sort(num);
        System.out.println("Ascending Order Sorting: "+ Arrays.toString(num));

        Integer[] number = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            number[i]=num[i];
        }

        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("Reversed Order Sorting: "+Arrays.toString(number));
    }
}
