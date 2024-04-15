package com.revision.retry;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        int[] b = {1, 2, 3, 1};

        boolean arrayEqual = true;

        if(a.length==b.length){
            for (int i=0; i<a.length; i++){
                if(a[i]!=b[i])
                    arrayEqual=false;
            }

        }else{
            arrayEqual=false;
        }

        if(arrayEqual)
            System.out.println("Arrays are EQUAL");
        else
            System.out.println("Arrays are UNEQUAL");
    }
}
