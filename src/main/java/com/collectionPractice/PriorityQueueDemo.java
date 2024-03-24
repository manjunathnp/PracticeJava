package com.collectionPractice;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        PriorityQueue emptyQueue = new PriorityQueue<>();

        pq.add(1);
        pq.add(2);
        pq.add(3);
        //pq.offer("2"); // throws ClassCastException - pq allows only homogenous elements
        pq.offer(3);

        // insertion order preserved and allows duplicates
        //System.out.println(pq); // [1, 2, 3, 3]

        //to print head element
        //System.out.println(pq.element());   // 1

        //throws exception
        //System.out.println(emptyQueue.element());   //Exception

        //throws null
        //System.out.println(emptyQueue.peek());  // null

        // remove()
        pq.remove(); //removes and returns 1
        System.out.println(pq); // [2, 3, 3]

        // poll()
        //pq.poll();
        //System.out.println(pq); // [2, 3, 3]

        Iterator it = pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(Object obj: pq){
            System.out.println(obj);
        }


    }
}
