package com.concepts;

public class ClassA {
    int a = 100;
    static int b = 200;

    void m1(){
        System.out.println("Inside non-static m1()");
    }

    static void m2(){
        System.out.println("Inside static m2()");
    }

    void m3(){
        System.out.println("Inside non-static m3()");
        System.out.println("Directly accessing non-static variable: "+a);
        System.out.println("Directly accessing static variable: "+b);
        m2();
        m1();
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();

        System.out.println("Non-static variable: "+classA.a);
        System.out.println("Static variable: "+b);

        classA.m1();
        ClassA.m2();
        classA.m3();
    }
}
