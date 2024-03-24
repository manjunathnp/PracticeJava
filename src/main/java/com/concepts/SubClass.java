package com.concepts;

public class SubClass extends AbstractDemo {

    SubClass(){
        System.out.println("Inside SubClass constructor");
    }

    void m1() {
        System.out.println("Implmented m1");
    }

    public static void main(String[] args) {
        SubClass subClass=new SubClass();

    }

}
