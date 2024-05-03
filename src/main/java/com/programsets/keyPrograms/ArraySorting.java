package com.programsets.keyPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        int[] num = {2, 3, 0, 1, 10};

        System.out.println("Ascending Order: [Before Sort]\n"+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Ascending Order: [After Sort]\n"+ Arrays.toString(num));

        Integer[] number = new Integer[num.length];
        for(int i=0; i<number.length; i++){
            number[i]=num[i];
        }

        System.out.println("Descending Order: [Before Sort]\n"+ Arrays.toString(number));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("Descending Order: [After Sort]\n"+ Arrays.toString(number));
    }
}
