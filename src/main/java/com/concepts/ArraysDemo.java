package com.concepts;


class TestArray{
    int i;
}
public class ArraysDemo {
    public static void main(String[] args) {
        TestArray[] testArray = new TestArray[3];

        testArray[0]=new TestArray();
        testArray[1]=new TestArray();
        testArray[2]=new TestArray();

        for(Object object: testArray){
            System.out.println(object);
        }
    }
}
