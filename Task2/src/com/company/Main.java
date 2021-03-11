package com.company;

public class Main {

    public static void main(String[] args) {
        printEvenNumbers(8);
        printEvenNumbers(12);
//        test values :
//        printEvenNumbers(4);
//        printEvenNumbers(10);
//        printEvenNumbers(21);
    }

    public static void printEvenNumbers(int max){
        System.out.println("\n");
        for (int i = 2; i <= max; i++) {
            if(i % 2 == 0){
                System.out.print("{" + i + "}");

            }
        }
    }
}
