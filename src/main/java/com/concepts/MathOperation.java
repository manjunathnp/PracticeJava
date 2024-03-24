package com.concepts;

public class MathOperation implements MathOperations{
    public static void main(String[] args) {
        MathOperation mathOperation=new MathOperation();
        System.out.println(MathOperations.add(12, 2));
        System.out.println(MathOperations.subtract(22, 2));
        System.out.println(mathOperation.multiply(2, 3));

    }
}
