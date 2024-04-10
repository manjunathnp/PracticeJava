package com.practiceSessions.session2;

import java.util.Arrays;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
        int[] num = {0,-1,2,-3,400,90};

        Arrays.sort(num);
        System.out.println("Ascending order sorting: "+Arrays.toString(num));

        Integer[] number = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            number[i]=num[i];
        }

        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("Descending order sorting: "+Arrays.toString(number));

    }
}
