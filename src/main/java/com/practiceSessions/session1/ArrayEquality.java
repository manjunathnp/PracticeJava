package com.practiceSessions.session1;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {6, 3, 4, 5, 2};
        int[] b = {2, 3, 4, 5, 6};

        arrayEquality(a, b);
    }

    private static void arrayEquality(int[] a, int[] b) {
        boolean isArrayEqual = true;

        for(int i=0; i<a.length; i++){
            if(a.length==b.length){
//                Arrays.sort(a);
//                Arrays.sort(b);
                if(a[i]!=b[i]){
                    isArrayEqual=false;
                }
            }else{
                isArrayEqual=false;
            }
        }
        if(!isArrayEqual){
            System.out.println("Arrays are unequal");
        }else{
            System.out.println("Arrays are equal");
        }
    }
}
