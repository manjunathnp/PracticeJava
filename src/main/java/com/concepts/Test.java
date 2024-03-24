package com.concepts;

public class Test {

    static {
        System.out.println("Static block executed");

    }

    private void m1(){
        System.out.println("private m1()");
    }

    public void m1(int a){
        System.out.println("public m1(int a)");
    }

    public static void method1() {
        System.out.println("inside static method1");
    }

    protected void method1(float a) {
        System.out.println("inside static method1");
    }



    private static void method1(int a){
        System.out.println("inside overloaded static method1");
    }

    private void method1(double a){
        System.out.println("inside non-static method1");
    }

    public Test() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Test t1 = new Test();  // Outputs "Static block executed" then "Constructor executed"
        Test t2 = new Test();

        method1();
        method1(10);
        t1.method1(10.2);

    }

    public static void main(){
        Test t3 = new Test();
        System.out.println("Second main method");
    }
}
            //  Inside Non-Static methods = can access both static and non-static members
            //  Inside Static methods = can access static members

