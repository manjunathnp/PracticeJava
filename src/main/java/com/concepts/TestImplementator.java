package com.concepts;


public class TestImplementator implements TestInterface{

    public static void main(String[] args) {
        TestImplementator testImplementator=new TestImplementator();
        testImplementator.m1();
        System.out.println(TestInterface.str);
        System.out.println(TestInterface.var1);
    }
    @Override
    public void m1() {
        System.out.println("Inside m1()");
    }
}
