package com.concepts;

class Apple{

    void fruit(){
        System.out.println("This is apple class");

    }

}

class Banana extends Apple{
    void fruit() {
        System.out.println("This is banana fruit");

    }
}
public class TestClass {

    public static void main(String[] args) {
        Banana banana = new Banana();
        banana.fruit();


    }
}


