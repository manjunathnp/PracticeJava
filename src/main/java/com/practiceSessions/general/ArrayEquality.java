package com.practiceSessions.general;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean isArrayEqual=true;

        if(a.length==b.length){
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0; i<a.length; i++){
                if(a[i]==b[i]){
                    isArrayEqual=true;
                }else{
                    isArrayEqual=false;
                }
            }
        }else {
            isArrayEqual=false;
        }
        if(isArrayEqual)
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are UnEqual");
    }
}
