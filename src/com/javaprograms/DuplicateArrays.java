package com.javaprograms;

public class DuplicateArrays {
    public static void main(String[] args) {
        String[] array1 = {"java", "python", "C#", "Java"};

        boolean status=false;
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
            System.out.println("NO Duplicates");
        }

    }
}
