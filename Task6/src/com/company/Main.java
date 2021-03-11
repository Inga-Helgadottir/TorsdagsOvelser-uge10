package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    processName(scan);
    }

    public static void processName(Scanner scan){
        System.out.println("Write your full name here: ");
	    String input = scan.nextLine();
        System.out.println(input.toUpperCase(Locale.ROOT));
    }
}
