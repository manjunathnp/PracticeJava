package com.concepts.runners;

class A{
    void methodA(){
        System.out.println("inside methodA()");
    }
}

class B extends A{
    void methodB(){
        System.out.println("inside methodB()");
    }
}
public class Runner1 {
    public static void main(String[] args) {
        int a = 10;
        double b;

        //Auto-widening
        b = a;
        System.out.println("Auto-widening: "+b);

        double c = 15.03;
        int d;

        d = (int)c;
        //Explicit Narrowing
        System.out.println("Explicit Narrowing: "+d);

        /*B b1 = new B();

        b1.methodB();
        b1.methodA();*/

        //Upcasting
        /*A b2=new B();
        b2.methodA();*/

        //Downcasting
        B  b3=(B)new A();

        b3.methodA();
        b3.methodB();
    }
}
