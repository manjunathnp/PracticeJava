package com.programsets.set2.Thu250424;

public class RootFinder {
    public static void main(String[] args) {
        int num=36;

        for(int i=1; i<=num; i++){
            if(i*i==num){
                System.out.println("Root of "+num+" = "+i);
            }
        }
    }
}
