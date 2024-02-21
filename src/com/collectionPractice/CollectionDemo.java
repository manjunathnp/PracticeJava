package com.collectionPractice;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(10.09);
        al.add(true);
        al.add("String");
        al.add('a');

        System.out.println(al); // [10, 10.09, true, String, a]

        ArrayList<String> strAl = new ArrayList<>();
        strAl.add("String1");
        strAl.add("String2");
        strAl.add("String3");
        strAl.add("String4");
        //strAl.add(4); // wont allow

        System.out.println(strAl);  // [String1, String2, String3, String4]


    }
}
