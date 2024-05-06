package com.programsets.kppract1;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        int[] num = {-1, 2, 3,0, 4, 5};

        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("\n");

        Integer[] number = new Integer[num.length];
        for(int i=0; i<number.length; i++){
            number[i]=num[i];
        }

        System.out.println(Arrays.toString(number));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println(Arrays.toString(number));

    }
}
