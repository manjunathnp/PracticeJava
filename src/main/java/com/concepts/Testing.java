package com.concepts;

public class Testing {

    void addition(int a, int b){
        System.out.println(a+b);
    }

    void addition(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void addition(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Testing testing = new Testing();

        testing.addition(10, 20);
        testing.addition(12.00, 15.21);
        testing.addition(10, 100, 1000);

    }
}
