package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        randomNumbers();
    }

    public static void randomNumbers(){
        Random rand = new Random();
        boolean firstTime = true;
        int start = 0;
        while(start < 900){
            if(firstTime == true){
                firstTime = false;
                int randNbr = rand.nextInt((1000 - 0) + 1) + 0;
                start = randNbr;
            }else{
                int randNbr = rand.nextInt((1000 - 0) + 1) + 0;
                start = randNbr;
            }
            System.out.println(start);
        }
    }
}
