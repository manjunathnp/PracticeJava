package com.programsets.set3.Fri260424;

public class DuplicateArrays {
    public static void main(String[] args) {
        String[] a = {"java", "c#", "python", "perl", "ruby", "php"};

        boolean duplicate=false;

        System.out.println("Duplicates: ");
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    duplicate=true;
                    break;
                }
            }
        }
        if(duplicate){
            System.out.println("Duplicates Found");
        }else {
            System.out.println("No Duplicates Found");
        }
    }
}
