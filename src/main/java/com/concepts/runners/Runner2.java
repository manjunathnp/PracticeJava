package com.concepts.runners;

class A1{
    void m1(){
        System.out.println("inside m1()");
    }
}

class B1 extends  A1{
    void m2(){
        System.out.println("inside m2()");
    }
}
public class Runner2 {
    public static void main(String[] args) {
        A1 a1=new B1();
        B1 b1= (B1)a1;

        b1.m1();
        b1.m2();
    }

}
