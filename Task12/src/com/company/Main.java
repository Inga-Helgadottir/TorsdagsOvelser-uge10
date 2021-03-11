package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 5, 33, 7, 43, 8, 9, 22, 8, 4};//43
//        test values:
//        int[] intArray = {1, 5, 33, 7, 43, 8, 9, 66, 8, 4};//66
//        int[] intArray = {100, 5, 33, 7, 43, 8, 9, 22, 8, 4};//100
        max(intArray);
    }

    public static int max(int[] intArray){
        int biggest = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] > biggest){
                biggest = intArray[i];
            }
        }
        System.out.println(biggest);
        return biggest;
    }
}
