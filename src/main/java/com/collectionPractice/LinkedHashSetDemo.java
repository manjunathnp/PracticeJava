package com.collectionPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add(300);
        linkedHashSet.add(400);
        linkedHashSet.add(500);
        System.out.println(linkedHashSet);  //[100, 200, 300, 400, 500]

        linkedHashSet.addLast(600);
        System.out.println(linkedHashSet);

    }
}
