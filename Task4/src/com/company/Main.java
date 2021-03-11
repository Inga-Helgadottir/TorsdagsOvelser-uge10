package com.company;

public class Main {

    public static void main(String[] args) {
        sumDigits(222);//6
        sumDigits(234);//9
        sumDigits(444);//12
    }

    public static int sumDigits(int nbr){
        String digits = new Integer(nbr).toString();
        int sum = 0;
        for (char c: digits.toCharArray()) {
            sum += c - '0';
        }
        System.out.println(sum);
        return sum;
    }
}
