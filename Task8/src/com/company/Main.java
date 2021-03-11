package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        shortestName(scan, 3);

    }

    public static void shortestName(Scanner scan, int nbr){
        System.out.println("Write your names here: ");
        String longest = "";
        for (int i = 0; i < nbr; i++) {
            String input = scan.nextLine();
            System.out.println(input.length());
            if(input.length() > longest.length()){
                longest = input;
            }
        }
        System.out.println(longest);
    }
}
