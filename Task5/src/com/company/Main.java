package com.company;

public class Main {

    public static void main(String[] args) {
        reverseVertical("laptop");
//        test values:
//        reverseVertical("hihi");
//        reverseVertical("muhaha");
//        reverseVertical("something here");
    }

    public static void reverseVertical(String originalString) {
        char[] chars = originalString.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
