package com.revision.session1;

public class DuplicateArray {
    public static void main(String[] args) {
        String[] a = {"java", "c#", "python", "perl", "ruby", "php", "java", "php"};

        boolean duplicates = false;

        System.out.println("Duplicates: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    duplicates = true;
                    System.out.println(a[i]);
                    break;
                }
            }
        }
        if(duplicates==false)
            System.out.println("No Duplicates Found");
    }
}
