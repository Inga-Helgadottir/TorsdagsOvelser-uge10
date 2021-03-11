package com.company;

public class Main {

    public static void main(String[] args) {
        printMultiple(5);//5 og 10 og 15....50
        printMultiple(6);//6 og 12 og 18....60
    }

    public static void printMultiple(int nbr){
        for (int i = 1; i <= 10; i++) {
            if(i == 10){
                System.out.print(nbr * i + "\n");
            }else{
                System.out.print(nbr * i + " og ");
            }
        }
    }
}
