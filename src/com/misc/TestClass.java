package com.misc;

class A{
    A(int a){
        System.out.println("Inside A constructor");
    }

    int a = 100;
    static int b=200;
    void a1(){

        System.out.println("a1 method");
    }

}

class B extends A{
    B(double b){
        super(9);
        System.out.println("Inside B constructor");
    }
   void m1(){
       super.a=100;
       super.a1();
   }

}

class C extends B{
    C(){
      super(10.2);
        System.out.println("Inside C constructor");
    }

}
public class TestClass {
    public static void main(String[] args){
        C c = new C();




    }
}
