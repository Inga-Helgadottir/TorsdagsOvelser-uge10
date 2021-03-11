package com.company;

public class Main {

    public static void main(String[] args) {
        repeat("Hej");
        repeat("");

    }

    public static String repeat(String myString){
        String result = "";
        if(myString != ""){
            System.out.println(myString + myString + myString);
            result = myString;
        }
        return result;
    }
}
