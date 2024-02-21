package com.collectionPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>(); //heterogeneous data
        LinkedList<Integer> numLinkList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add(true);
        linkedList.add(null);
        linkedList.add(1);

        System.out.println(linkedList); // [a, true, null, 1]

        System.out.println(linkedList.size()); // 4

        linkedList.remove(2);
        System.out.println(linkedList); // [a, true, 1]

        linkedList.add(2, "Java");
        System.out.println(linkedList); //[a, true, Java, 1]

        System.out.println(linkedList.get(2)); // Java

        linkedList.set(1, false);
        System.out.println(linkedList); // [a, false, Java, 1]

        System.out.println(linkedList.contains("Python")); // false

        System.out.println(linkedList.isEmpty()); // false


        //Reading by for loop
        for(int i=0; i<linkedList.size(); i++){
            System.out.print(linkedList.get(i)+" "); // a false Java 1
        }

        System.out.println();
        // Reading by for-each loop
        for(Object object: linkedList){
            System.out.print(object+" ");   // a false Java 1
        }

        System.out.println();
        // Reading by iterator
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" "); // a false Java 1
        }

    }
}
