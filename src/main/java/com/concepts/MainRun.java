package com.concepts;

class People{
    private String name;

    People(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
public class MainRun {
    public static void main(String[] args) {
        People people=new People("Haris");

        System.out.println("Name: "+people.getName());
        people.setName("Harrison");
        System.out.println("Update Name: "+people.getName());
    }



}
