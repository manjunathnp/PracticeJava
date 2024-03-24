package com.practiceSessions.session3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        String[] str = {"item1", "item2", "item3", "item1"};

        removerOfDuplicates(str);
    }

    private static void removerOfDuplicates(String[] str){
        int duplicateCounter=0;

        System.out.println("Duplicates: ");
        for(int i=0; i< str.length; i++){
            for(int j=i+1; j<str.length; j++){
                if(str[i].equalsIgnoreCase(str[j])){
                    duplicateCounter++;
                    System.out.println(str[i]);
                }
            }
        }
        System.out.println("No. of Duplicates: "+duplicateCounter);

        System.out.println("After Removing Duplcates: ");
        Set<String> stringSet = new LinkedHashSet<>(Arrays.asList(str));
        for(String string:stringSet){
            System.out.println(string);
        }
    }

}


/*
*   Duplicates:
    item1
    No. of Duplicates:1
    After Removing Duplicates:
    item1
    item2
    item3
*
* */