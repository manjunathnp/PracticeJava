package com.concepts;

public class MyClass {
    int i;

    MyClass(){
        i=20;
    }

    MyClass(int i){
        this.i=i;
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        myClass.m1();
        System.out.println(myClass.i);
        System.out.println(Constants.LONG_WAIT);

        browserName();

    }

    public void m1(){
        i=5;
        System.out.println(Constants.LONG_WAIT);
    }

    public static void browserName(){
        System.out.println(BrowserConstants.CHROME);
    }
}
