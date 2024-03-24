package com.concepts;

import java.util.Collections;

public class BoxingUnboxing {
    public static void main(String[] args) {

        /*int primitiveInt = 10;
        Integer integerObject = primitiveInt;
        System.out.println("The value of the Integer object is: " + integerObject);

        int backToint = integerObject.intValue();
        System.out.println("The value of the primitive int is: " + backToint);*/
        m1();

    }

    static void m1(){
        int a = 100;
        Integer intObj = a; //auto-boxing

        System.out.println(intObj);

        int b = intObj.intValue();  //unboxing
        System.out.println(b);

        double c = 102.2;
        Double doubleObj = c;
        System.out.println(doubleObj);

        double d = doubleObj.doubleValue();
        System.out.println(d);

        
    }
}
