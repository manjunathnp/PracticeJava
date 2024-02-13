package com.concepts;

class Parent{
    void m1(){
        System.out.println("Inside Parent m1()");
    }

}

class ChildA extends Parent{
    void m2(){
        System.out.println("Inside Child m2()");
    }

}

class ChildB extends Parent{
    void m3(){
        System.out.println("Inside Child m3()");
    }
}


class UpDown{
    public static void main(String[] args) {
        int a = 100;
        double b;

        //Auto-widening
        b = a; //converting int(a) to double(b) type
        System.out.println(b); //100.0

        //Explicit Narrowing
        a = (int)b;  // converting double(b) explicitly to int(a)
        System.out.println(a); //100

        ChildA childA = new ChildA();
        childA.m1();
        childA.m2();

        /*//Auto-Upcasting the child object to parent object
        Parent parent=new Child();
        parent.m1();

        Parent parent1 = new Parent();
        parent1.m1();

        *//*Child child1 = (Child) new Parent();
        child1.m2();
        child1.m1();*//*

        Child child1=(Child) parent;
        child1.m1();
        child1.m2();*/


        //Upcasting
        Parent parent=new ChildA();
        parent.m1();

        //Downcasting
        ChildA child1=(ChildA)parent;
        child1.m2();
        child1.m1();


        //Downcasting
        Parent parent2=new ChildB();

        ChildB child2=(ChildB)parent2;
        child2.m3();
        child2.m1();



    }

}
