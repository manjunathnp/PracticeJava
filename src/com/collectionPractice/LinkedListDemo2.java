package com.collectionPractice;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("X");
        linkedList.add("B");
        linkedList.add("Y");
        linkedList.add("Z");
        linkedList.add("C");

        System.out.println(linkedList); // [A, X, B, Y, Z, C]
        Collections.sort(linkedList);
        System.out.println(linkedList); // [A, B, C, X, Y, Z]

        LinkedList newLinkedList = new LinkedList<>();
        newLinkedList.addAll(linkedList);
        System.out.println(newLinkedList);  // [A, B, C, X, Y, Z]

        newLinkedList.removeAll(linkedList);
        System.out.println(linkedList); // [A, B, C, X, Y, Z]
        System.out.println(newLinkedList); // []

        Collections.shuffle(linkedList);
        System.out.println(linkedList); // [Y, C, X, A, B, Z]

        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println(linkedList); // [Z, Y, X, C, B, A]
    }
}
