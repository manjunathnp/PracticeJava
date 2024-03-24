package com.practiceSessions.session2;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 4};
        int[] b = {1, 2, 4, 2};

        boolean isArrayEqual = true;

        if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    isArrayEqual=false;
                }
            }
        }else{
            isArrayEqual=false;
        }

        if(!isArrayEqual)
            System.out.println("Arrays are unequal");
        else
            System.out.println("Arrays are equal");
    }
}
