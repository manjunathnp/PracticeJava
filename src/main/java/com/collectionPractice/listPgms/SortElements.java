package com.collectionPractice.listPgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("n1");
        list.add("n0");
        list.add("n3");

        System.out.println("Before Sorting[ASC]: "+list);
        Collections.sort(list);
        System.out.println("After Sorting[ASC]: "+list);

        System.out.println("Before Sorting[DSC]: "+list);
        Collections.reverse(list);
        System.out.println("After Sorting[DSC]: "+list);

    }
}
