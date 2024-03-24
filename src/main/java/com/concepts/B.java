package com.concepts;

public class B extends A{
    public static void bM1(){
        System.out.println("Inside bM1() of class B");
    }

    public void bM2(){
        System.out.println("Inside bM2() of class B");
    }
    public static void main(String[] args) {
        A a = new A();
        a.x=20;
        A.y=200;
        A.m2();
        a.m1();
    }
}

