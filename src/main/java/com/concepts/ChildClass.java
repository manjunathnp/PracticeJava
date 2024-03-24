package com.concepts;

public class ChildClass extends ParentClass{
    void add(int a){
        System.out.println("In child class");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.add(10);
    }

}
