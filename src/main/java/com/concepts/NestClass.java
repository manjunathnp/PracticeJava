package com.concepts;

public class NestClass implements OuterInterface.InnerInterface{

    @Override
    public void innerMethod() {
        System.out.println("Implemented innerMethod()");
    }

    public static void main(String[] args) {
        NestClass nestClass=new NestClass();
        nestClass.innerMethod();
    }
}
