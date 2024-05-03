package com.programsets.set3.Fri260424;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};

        boolean equalArray=true;

        if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                for(int j=0; j<b.length; j++){
                    if(a[i]!=b[i]){
                        equalArray=false;
                        break;
                    }
                }
            }

        }else {
            equalArray=false;
        }
        if(equalArray){
            System.out.println("EQUAL ARRAYS");
        }else {
            System.out.println("UNEQUAL ARRAYS");
        }
    }
}
