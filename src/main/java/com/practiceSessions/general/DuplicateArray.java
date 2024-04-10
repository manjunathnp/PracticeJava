package com.practiceSessions.general;

public class DuplicateArray {
    public static void main(String[] args) {
        String[] a = {"java", "selenium", "python"};

        boolean isDuplicate = false;

        System.out.println("Duplicates: ");
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i].equalsIgnoreCase(a[j])){
                    isDuplicate=true;
                    System.out.println(a[i]);
                }
            }
        }
        if(isDuplicate==true)
            System.out.println("Contains Duplicates");
        else
            System.out.println("No Duplicates");
    }
}
