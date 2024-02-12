package com.concepts;

public class A {
    int x;
    static int y;

    //Default constructor
    A(){
        System.out.println("Inside Default Construct");
    }

    //Parameterized constructo
    A(int a){
        System.out.println("Inside Parameterized Constructor with int a");
    }

    A(int a, int b){
        System.out.println("Inside Parameterized Constructor with int a, int b");
    }

    A(double a){
        System.out.println("Inside Parameterized Constructor with float a");
    }

    A(double a, int b){
        System.out.println("Inside Parameterized Constructor with float a, int b");
    }

    public void m1(){
        System.out.println("Inside m1() of class A");
    }

    public static void m2(){
        System.out.println("Inside m2() of class B");
    }

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A(10);
        A a2 = new A(10, 20);
        A a3 = new A(10.5);
        A a4 = new A(12.0, 2);

        a.x = 100;
        a1.x = 200;

        y=1000;

        /*System.out.println("Value of x: "+a1.x);
        System.out.println("Value of y: "+y);*/

    }
}
