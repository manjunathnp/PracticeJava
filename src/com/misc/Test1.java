package com.misc;

public class Test1 {
    public static void main(String[] args) {
        int[] arrNums = {1, 2, 3, 4, 5};

        int eSum =0;
        int oSum=0;

        for(int i=0; i<arrNums.length; i++){
            if(arrNums[i]%2==0){
                eSum=eSum+arrNums[i];
            }else if(arrNums[i]%2 != 0){
                oSum=oSum+arrNums[i];
            }
        }
        System.out.println("Even sum: "+eSum); //6
        System.out.println("Odd sum: "+oSum);   //9
    }
}
