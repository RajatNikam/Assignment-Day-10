package com.blz.addressbook;

import java.util.ArrayList;

public class UserInput implements InterAddressBook {

    @Override
    public void Display(int temp, ArrayList<ArrayList<String>> addBook, String[] index) {

    }

    @Override
    public void UserInputs(int temp, ArrayList<ArrayList<String>> addBook, String[] index) {
        for (int j = 0; j < temp; j++) {
            System.out.println("\nEnter Details below ...\n");
            for (int i = 0; i < 8; i++) {

                System.out.print("Enter your " + index[i] + " : ");
                addBook.get(i).add(UserInputUtils.stringInput());

            }

        }
    }
}