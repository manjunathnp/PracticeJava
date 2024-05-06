package com.programsets.kppract1;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {0, 2, 2};
        int[] b = {0, 2, 2};

        boolean arraysEqual=true;
        if(a.length==b.length){
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0; i<a.length; i++){
                if(a[i]==b[i]){
                    arraysEqual=true;
                }else {
                    arraysEqual=false;
                }
            }
        }else {
            arraysEqual=false;
        }

        if(arraysEqual){
            System.out.println("Arrays are Equal");
        }else {
            System.out.println("Arrays are Unequal");
        }
    }
}
