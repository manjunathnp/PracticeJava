package com.programsets.set3.Fri190424;

public class DuplicateArray {
    public static void main(String[] args) {
        String[] a = {"java", "python", "perl"};

        boolean duplicateArray=false;

        System.out.println("Duplicates: ");
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i].equalsIgnoreCase(a[j])){
                    System.out.println(a[i]);
                    duplicateArray=true;
                }
            }
        }
        if(duplicateArray==false){
            System.out.println("No Duplicates");
        }

    }
}
