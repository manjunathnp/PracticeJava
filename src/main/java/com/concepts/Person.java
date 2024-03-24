package com.concepts;

public class Person {
    int age;
    String name;

    Person(int age, String name){
        this.age=age;
        this.name=name;
    }

    void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }

    public static void main(String[] args) {
        Person person1=new Person(21, "David");
        person1.displayInfo();

        Person person2=new Person(22, "Mark");
        person2.displayInfo();
    }
}
