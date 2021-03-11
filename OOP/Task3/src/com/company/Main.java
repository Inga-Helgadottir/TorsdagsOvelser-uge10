package com.company;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Customer> cusArray = new ArrayList<>();
    public static void main(String[] args) {

        cusArray.add(new Customer("aaaaaaaaaa", "aaa", "aaaa"));
        cusArray.add(new Customer("bbbbbbbbbb", "bbb", "bbbb"));
        cusArray.add(new Customer("cccccccccc", "ccc", "cccc"));
        cusArray.add(new Customer("dddddddddd", "ddd", "dddd"));
        cusArray.add(new Customer("eeeeeeeeee", "eee", "eeee"));
        cusArray.add(new Customer("ffffffffff", "fff", "ffff"));

        //printCustomers();
        findCustomer(4);
    }

    public static void printCustomers(){
        for (Customer customer : cusArray) {
            System.out.println(customer.toString());
        }
    }

    public static void findCustomer(int id){
        for (Customer customer : cusArray) {
            int check = customer.getId();
            if(check == id){
                System.out.println(customer.toString());
            }
        }
    }
}
