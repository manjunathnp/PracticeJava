package com.practiceSessions.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {1,0,2,3};

        sortUsingBuiltInMethod(a);
        sortUsingCustomMethod(a);
    }

    private static void sortUsingCustomMethod(int[] a) {
        /*Integer[] integers = new Integer[a.length];
        for(int i=0; i<a.length; i++){
            integers[i] = a[i];
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(integers));
        Collections.sort(list);
        System.out.println(list);*/

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }

    private static void sortUsingBuiltInMethod(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
