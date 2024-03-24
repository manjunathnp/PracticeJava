package com.concepts;

class Animal{
    Animal(){
        System.out.println("Animal");
    }

    Animal(String name){
        System.out.println(name+" animal");
    }

}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog");
    }

}
public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Animal dog1 = new Animal("German Shephard");
    }



}
