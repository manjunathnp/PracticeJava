        package com.concepts;

        interface I1{
            int a=100; //public final static
            void m1();  //public and abstract
            void m2();
        }

        interface I2{
            void m3();
        }
        abstract class A1 implements I1{
            public void m1(){
                System.out.println("test");
                System.out.println(a);
            }

        }

        class B1 extends A1{
            public void m2(){
                System.out.println("Test2");
                System.out.println(a);
            }
        }

        class C1 extends B1 implements I1, I2{
            public void m3(){
                System.out.println("test3");
                System.out.println(a);
            }
        }



        public class RunnerClass {
            public static void main(String[] args) {
                C1 c1 = new C1();

            }
        }
