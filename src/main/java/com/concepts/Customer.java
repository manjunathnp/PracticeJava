package com.concepts;

public class Customer {
    int age;
    String name;

    Customer(int age, String name){
        this.age=age;
        this.name=name;
    }

    void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }

    public static void main(String[] args) {
        Customer person1=new Customer(21, "David");
        person1.displayInfo();

        Customer person2=new Customer(22, "Mark");
        person2.displayInfo();
    }
}
