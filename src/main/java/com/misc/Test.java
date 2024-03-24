package com.misc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a1 = {1,2, 3, 4};

        maxMinArray(a1);
    }

    private static void maxMinArray(int[] a1) {

       int max = a1[0];
       for(int i=0; i<a1.length; i++){
           if(max < a1[i]){
               max=a1[i];
           }
       }
        System.out.println("Max: "+max);

       int min=a1[0];
       for(int i=0; i<a1.length; i++){
           if(min > a1[i]){
               min=a1[i];
           }
       }
        System.out.println("Min: "+min);
    }

}



