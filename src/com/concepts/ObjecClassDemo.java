package com.concepts;

public class ObjecClassDemo {

    public static void main(String[] args) {

        Object object = new Object();

        ObjecClassDemo objecClassDemo = new ObjecClassDemo();
        ObjecClassDemo objecClassDemo2 = new ObjecClassDemo();

        System.out.println("HexaCode: "+objecClassDemo.toString());
        System.out.println("Hascode :"+objecClassDemo.hashCode());
        System.out.println("Are they equal? using equals(): "+objecClassDemo.equals(objecClassDemo2));
        if(objecClassDemo==objecClassDemo2)
            System.out.println("Equal");
        else
            System.out.println("Unequal");



    }
}
