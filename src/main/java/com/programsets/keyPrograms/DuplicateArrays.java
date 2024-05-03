package com.programsets.keyPrograms;

public class DuplicateArrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple"};

        boolean duplicate = false;
        System.out.println("Duplicates: ");
        for(int i=0; i<fruits.length; i++){
            for(int j=i+1; j< fruits.length; j++){
                if(fruits[i] == fruits[j]){
                    System.out.println(fruits[i]);
                    duplicate=true;
                    break;
                }
            }
        }
        if(duplicate==true){
            System.out.println("Duplicates Found");
        }else {
            System.out.println("Duplicates Not Found");
        }

    }
}
