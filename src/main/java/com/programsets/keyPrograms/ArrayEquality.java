package com.programsets.keyPrograms;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 2};

        boolean arrayEqual = true;

        if(a.length==b.length){
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0; i<a.length; i++){
                    if(a[i]==b[i]){
                        arrayEqual=true;
                    }else {
                        arrayEqual=false;
                    }
            }
        }else {
            arrayEqual=false;
        }
        if(arrayEqual)
            System.out.println("Equal Arrays");
        else
            System.out.println("Unequal Arrays");
    }
}
