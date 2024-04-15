package com.revision.redo;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2, 2};
        int[] b = {1, 2, 3, 4, 5, 2, 2};
        /*boolean arraysEqual=true;

        if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    arraysEqual=false;
                    break;
                }
            }

        }else {
            arraysEqual=false;
        }

        if(arraysEqual){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are unequal");
        }*/

        boolean arraysEqual = Arrays.equals(a, b);
        if(arraysEqual)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are unequal");

    }
}
