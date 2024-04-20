package com.programsets.set3.Fri190424;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] num = {10, 100, 15, 50, 40};

        System.out.println("[ASC]Before Sort: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("[ASC]After Sort: " + Arrays.toString(num));

        Integer[] number = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            number[i]=num[i];
        }
        System.out.println("[DSC]Before Sort: " + Arrays.toString(number));
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("[DSC]After Sort: " + Arrays.toString(number));

    }
}
