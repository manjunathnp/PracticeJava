package com.concepts;

public class NestClass2 implements OuterInterface{
    public void outerMethod(){
        System.out.println("Implemented outerMethod()");
    }

    public static void main(String[] args) {
        NestClass2 nestClass2=new NestClass2();
        nestClass2.outerMethod();

        Object obj = "test";
        System.out.println(obj);
    }
}
