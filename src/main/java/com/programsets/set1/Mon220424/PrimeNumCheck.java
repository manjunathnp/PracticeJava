package com.programsets.set1.Mon220424;

public class PrimeNumCheck {
    public static void main(String[] args) {
        int num = 15;

        if(num>0){
            int count=0;
            for(int i=1; i<=num; i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("PRIME NUMBER");
            }else {
                System.out.println("NON-PRIME NUMBER");
            }

        }else{
            System.out.println("Invalid input");
        }
    }
}
