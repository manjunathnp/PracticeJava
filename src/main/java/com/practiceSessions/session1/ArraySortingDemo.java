package com.practiceSessions.session1;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingDemo {
    public static void main(String[] args) {
        int[] num = {-2, -5, 2, 10, 0};

        Arrays.sort(num);
        System.out.println("After sorting in ascending order: "+Arrays.toString(num));

        Integer[] number = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            number[i]=num[i];
        }

        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("After sorting in descending order: "+Arrays.toString(number));
    }
}
