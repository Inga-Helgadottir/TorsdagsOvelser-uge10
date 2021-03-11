package com.company;

public class Main {

    public static void main(String[] args) {
        //true
        int[] array1 = {2, 54, 7, 6, 45, 76, 434, 3};
        int[] array2 = {3, 55, 8, 7, 46, 77, 435, 4};
        //false - not the same size
//        int[] array1 = {2, 54, 7, 6, 45, 76, 434, 3, 5};
//        int[] array2 = {3, 55, 8, 7, 46, 77, 435, 3};
        //false 1 or more numbers in array1 is bigger than the one in array2
//        int[] array1 = {2, 54, 7, 6, 45, 76, 434, 4};
//        int[] array2 = {3, 55, 8, 7, 46, 77, 435, 3};
        allLess(array1, array2);
    }

    public static boolean allLess(int[] array1, int[] array2){
        int count = 0;
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length-1; i++) {
                if(array1[i] < array2[i]){
                    count ++;
                }
                if(count == array1.length-1){
                    System.out.println("returns true");
                    return true;
                }else{
                    System.out.println("returns false\nbecause one or more numbers in array1 is bigger than the one in array2");
                    return false;
                }
            }
        }else{
            System.out.println("These arrays are not the same size");
            System.out.println("returns false");
            return false;
        }
        System.out.println("returns true");
        return true;
    }
}
