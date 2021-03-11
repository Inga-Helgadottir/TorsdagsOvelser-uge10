package com.company;

public class Main {

    public static void main(String[] args) {
	    min(3, -2, 7);//-2
	    min(19, 27, 6);//6
//        test values:
//        min(33, 99, 1);//1
//        min(20, 55, 10);//10
//        min(0, 5, 2);//0
    }

    public static int min(int a, int b, int c){
        int aOrB = Math.min(a, b);
        int bOrC = Math.min(b, c);
        int result = Math.min(aOrB, bOrC);
        System.out.println(result);
        return result;
    }
}
