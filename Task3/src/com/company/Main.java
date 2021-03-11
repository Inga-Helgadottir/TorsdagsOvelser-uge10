package com.company;

public class Main {

    public static void main(String[] args) {
        smallestAbsValue(1, 9, -11);
        smallestAbsValue(-8, 2, 12);
//        smallestAbsValue(-1, 9, -11);


    }

    public static int smallestAbsValue(int a, int b, int c){
        int aA = Math.abs(a);
        int aB = Math.abs(b);
        int aC = Math.abs(c);
        int aOrB = Math.min(aA, aB);
        int bOrC = Math.min(aB, aC);
        int result = Math.min(aOrB, bOrC);
        System.out.println(result);
        return result;
    }
}
