package com.blz.addressbook;

import java.util.ArrayList;

public class DisplyOutput implements InterAddressBook {

    @Override
    public void Display(int temp, ArrayList<ArrayList<String>> addBook, String[] index) {
        System.out.println("Your Data Got Stored Successfully in Memory ...");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < temp; j++) {
                if (j == 0) {
                    System.out.print(index[i] + " : " + addBook.get(i).get(j) + " | ");
                } else {
                    System.out.print(addBook.get(i).get(j) + " | ");
                }
            }
            System.out.println();
        }

    }
}