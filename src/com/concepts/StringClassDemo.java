package com.concepts;

public class StringClassDemo {
    public static void main(String[] args) {
        String s1 = "this is a sample string";


        System.out.println(s1.toString());

        //Immutable
        String str = "Java";
        System.out.println(str);
        System.out.println("Address of str before changing : "+str.hashCode());

        str = "Java Selenium";
        System.out.println(str);
        System.out.println("Address of str after changing : "+str.hashCode());

        String a = "test";
        String b = "test";
        System.out.println(a.equals(b));
        System.out.println(a==b);

        String string1 = new String("test1");
        String string2 = new String("test1");

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string1.equals(string2));
        System.out.println(string1==string2);


    }

}
