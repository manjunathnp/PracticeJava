package com.javaprograms;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 0, 5};

        /*if(Arrays.equals(a,b))
            System.out.println("Equal");
        else
            System.out.println("Unequal");*/

        boolean status=true;
        if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    status=false;
                }
            }

        }else{
            status=false;
        }
        if(status){
            System.out.println("Equal");
        }else {
            System.out.println("Unequal");
        }

    }
}
