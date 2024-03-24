package com.concepts;

import org.apache.logging.log4j.core.util.JsonUtils;

class D {

    void m1(){
        System.out.println("Inside class D");
    }

    public static void main(String[] args) {
        System.out.println("Inside D");
    }

}

class D1 extends D{
    void m1(){
        System.out.println("Inside class D1");
    }

    public static void main(String[] args) {
        D d = new D();
        d.main(new String[]{"test"});
        System.out.println("Inside D1");
    }
}

class D2 extends D{
    void m1(){
        System.out.println("Inside class D2");
    }

}
