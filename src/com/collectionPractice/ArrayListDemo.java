package com.collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        List alList = new ArrayList();
        ArrayList<Integer> numAl = new ArrayList<Integer>();
        ArrayList<String> strAl = new ArrayList<String>();

        al.add("hello");
        al.add(2);
        al.add('c');
        al.add(true);
        System.out.println(al); // [hello, 1, c, true]

        System.out.println(al.size());  // 4

        al.remove("hello");
        System.out.println(al); // [2, c, true]

        al.add(0, "hello(updated)");
        System.out.println(al); // [hello(updated), 2, c, true]

        System.out.println(al.get(2)); // c

        al.set(2, "Java");
        System.out.println(al); // [hello(updated), 2, Java, true]

        System.out.println(al.contains("c"));   // false

        System.out.println(al.isEmpty());   // false
        System.out.println(numAl.isEmpty());    // true

        //Data iteration - for loop
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");    // hello(updated) 2 Java true
        }

        System.out.println();

        //Data iteration - for-each loop
        for(Object item:al){
            System.out.print(item+" ");  // hello(updated) 2 Java true
        }

        System.out.println();

        //Data iteration - using iterator
        Iterator iterator=al.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");  // hello(updated) 2 Java true
        }

    }
}
