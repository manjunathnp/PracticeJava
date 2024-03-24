package com.scrible;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        int[] num = {1, 3, 0, 10};
        Integer[] number = new Integer[num.length];
        for (int i = 0; i < num.length; i++) {
            number[i] = Integer.valueOf(num[i]);
        }

        System.out.println("Before Sorting: "+ Arrays.toString(number));
        Arrays.sort(num);
        System.out.println("After Sorting[ASC]: "+ Arrays.toString(num));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("After Sorting[DSC]: "+ Arrays.toString(number));
        /*int[] num = {1, 3, 0, 10};
        Integer[] numbers = new Integer[num.length];

        for (int i = 0; i < num.length; i++) {
            numbers[i] = Integer.valueOf(num[i]);
        }

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("After sorting: " + Arrays.toString(numbers));*/

    }
}
