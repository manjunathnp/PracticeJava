package com.practiceSessions.session1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        String[] array1 = {"str1", "str2", "str3", "str3"};

        //removeDuplicated(array1);
        //removeDuplicated2(array1);
        removeDuplicated3(array1);
    }

    private static void removeDuplicated3(String[] array1) {
        boolean status = false;

        System.out.println("Non-Duplicates: ");
        for(int i=0; i< array1.length; i++){
            for(int j=i+1; j< array1.length; j++){
                if(array1[i].equalsIgnoreCase(array1[j])){
                    status=true;
                    break;
                }
            }
            if(status==false){
                System.out.println(array1[i]);
            }
        }



        if(status==false){
            System.out.println("No Duplicates");
        }
    }

    private static void removeDuplicated2(String[] array1) {
        boolean status = false;

        System.out.println("Duplicates: ");
        for(int i=0; i<array1.length; i++){
            for(int j=i+1; j<array1.length; j++){
                if(array1[i].equalsIgnoreCase(array1[j])){
                    System.out.println(array1[i]);
                    status=true;
                }
            }
        }

        if(status==false){
            System.out.println("No Duplicates");
        }
    }

    private static void removeDuplicated(String[] array1) {
        Set<String> stringSet = new LinkedHashSet<>(Arrays.asList(array1));

        System.out.println("After removal of duplicates: ");
        for(String element: stringSet){
            System.out.print(element+" ");
        }
    }
}
