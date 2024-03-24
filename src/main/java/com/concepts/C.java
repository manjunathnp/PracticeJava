package com.concepts;

public class C {
    int a;

    C(){
        System.out.println("Inside Default Constructor");
    }

    C(int a){
        this.a=a;
        System.out.println("Inside Parameterized Constructor");
    }
    public static void main(String[] args) {
        C c1 = new C();
        c1.a=100;

        C c2 = new C(10);
        c2.a=200;
        System.out.println(c1.a);
        System.out.println(c2.a);


    }

}
