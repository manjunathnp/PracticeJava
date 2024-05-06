package com.programsets.kppract1;

public class DuplicateArrays {
    public static void main(String[] args) {
        String[] colors = {"red", "yellow", "blue", "green", "red"};

        boolean dupArray=false;

        System.out.println("Duplicates: ");
        for(int i=0; i<colors.length; i++){
            for(int j=i+1; j<colors.length; j++){
                if(colors[i]==colors[j]){
                    System.out.println(colors[i]);
                    dupArray=true;
                    break;
                }
            }
        }
        if(dupArray==false)
            System.out.println("No Duplicates");
        else
            System.out.println("Duplicates Found");
    }
}
