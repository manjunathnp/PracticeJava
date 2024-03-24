package com.concepts;

public class MarkerClass implements MarkerInterface{

    void display(){
        System.out.println("Inside display() of MarkerClass");
    }

    public static void main(String[] args) {
        MarkerClass markerClass=new MarkerClass();

        if(markerClass instanceof MarkerInterface){
            markerClass.display();
        }else {
            System.out.println("Not part of MarkerInterface");
        }
    }
}
