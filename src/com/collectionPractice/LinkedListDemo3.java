package com.collectionPractice;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();

        linkedList.add("Dog");
        linkedList.add("Tiger");

        System.out.println(linkedList); // [Dog, Tiger]

        linkedList.addFirst("Tiger");
        linkedList.addLast("Elephant");
        System.out.println(linkedList); // [Tiger, Dog, Tiger, Elephant]

        linkedList.add(1, "Cow");
        System.out.println(linkedList); // [Tiger, Cow, Dog, Tiger, Elephant]

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList); //[Cow, Dog, Tiger]

        linkedList.set(2, "Cat");
        System.out.println(linkedList);

        System.out.println(linkedList.get(1)); // Dog
        System.out.println(linkedList.getFirst()); // Cow
        System.out.println(linkedList.getLast()); // Cat
    }
}
