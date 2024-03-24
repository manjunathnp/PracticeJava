package com.misc;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Math.random());

        Random random = new Random();
        System.out.println(random.nextInt(50));
        System.out.println(random.nextBoolean());
    }
}
