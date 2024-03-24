package com.scrible;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] num = {10, 9, 2, -1, 0};

        System.out.println("Before[ASC]: "+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("After[ASC]: "+ Arrays.toString(num));

        Integer[] numbers = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            numbers[i] = Integer.valueOf(num[i]);
        }
        System.out.println("Before[DSC]: "+ Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("After[DSC]: "+ Arrays.toString(numbers));

    }

}
