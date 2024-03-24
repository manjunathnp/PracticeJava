package com.practiceSessions.session2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        String[] str = {"item1", "item2", "item3", "item1"};

        removerOfDuplicates(str);
    }

    private static void removerOfDuplicates(String[] str) {
        int duplicateCounter=0;
        boolean isDuplicate = false;

        System.out.println("Duplicates: ");
        for(int i=0; i<str.length; i++){
            for(int j=i+1; j<str.length; j++){
                if(str[i].equalsIgnoreCase(str[j])){
                    duplicateCounter++;
                    isDuplicate=true;
                    System.out.println(str[i]);
                }
            }
        }
        System.out.println("No. of Duplicates:"+duplicateCounter);

        Set<String> stringSet = new LinkedHashSet<>(Arrays.asList(str));
        System.out.println("After Removing Duplicates: ");
        for(String string: stringSet){
            System.out.println(string);
        }


    }
}

/*
*   No. of Duplicates: 1
*   Duplicates:
*   item1
*   After Removing Duplicates:
*   item1
*   item2
*   item3
* */
