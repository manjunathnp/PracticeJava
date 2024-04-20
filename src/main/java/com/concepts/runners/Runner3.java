package com.concepts.runners;

class Runner3Class{
    int i=100;
}
public class Runner3 {
    public static void main(String[] args) {
        Runner3Class runner3Class=new Runner3Class();
        Runner3Class runner3ClassA =new Runner3Class();

        System.out.println(runner3Class.toString());
        System.out.println(runner3Class.hashCode());

        System.out.println(runner3ClassA.equals(runner3Class));
    }
}
