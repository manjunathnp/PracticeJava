package com.programsets.set3.Fri190424;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b= {1, 2, 3};

        boolean arrayEqual=true;
        if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    arrayEqual=false;
                }
            }

        }else {
            arrayEqual=false;
        }

        if(arrayEqual){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are unequal");
        }
    }
}
