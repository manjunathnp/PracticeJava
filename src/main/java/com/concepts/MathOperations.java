package com.concepts;

public interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    default int multiply(int a, int b){
        method1();
        return a * b;
    }

    private void method1() {
        System.out.println("inside private method1");

    }
}


