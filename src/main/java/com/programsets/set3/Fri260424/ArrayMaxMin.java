package com.programsets.set3.Fri260424;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] a = {12, 1, 22, 23, 100};

        int max = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum: "+max);

        int min = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum: "+min);
    }
}
