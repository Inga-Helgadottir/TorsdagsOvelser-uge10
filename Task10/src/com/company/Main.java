package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int biggest = 0;
        int smallest = 99999;
        maxMin(biggest, smallest);
    }

    public static void maxMin(int biggest, int smallest){
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv et tal eller -1 for at afslutte:");
        try{
            int input =  Integer.parseInt(scan.nextLine());
            if(input != -1){
                if(biggest < input){
                    biggest = input;
                }
                if(smallest > input){
                    smallest = input;
                }
                maxMin(biggest, smallest);
            }else {
                System.out.println("The biggest number is: " + biggest);
                System.out.println("The smallest number is: " + smallest);
            }
        }catch(NumberFormatException e){
            System.out.println("Skriv et tal");
            maxMin(biggest, smallest);
        }
    }
}
