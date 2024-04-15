package com.revision.session2;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 0, 3, 4, 5};

        boolean arraysEqual = true;

        if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                {
                    if(a[i]!=b[i])
                        arraysEqual=false;
                }
            }

        }else{
            arraysEqual=false;
        }

        if(arraysEqual){
            System.out.println("Arrays are EQUAL");
        }else {
            System.out.println("Arrays are UNEQUAL");
        }
    }
}
