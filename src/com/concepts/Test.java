package com.concepts;

public class Test {
    int a;
    int b=100;
    static int c = 200;

    public void m1(){
        System.out.println(a);
        System.out.println(c);
    }

    public void m2(){
        System.out.println(b);
    }

    public Test initialize(int a){
        this.a=a;
        return this;

    }

    public static void m3(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m1();

        test.m2();

        test.initialize(500);
        System.out.println(test.a);

        m3();

    }
}
            //  Inside Non-Static methods = can access both static and non-static members
            //  Inside Static methods = can access static members





