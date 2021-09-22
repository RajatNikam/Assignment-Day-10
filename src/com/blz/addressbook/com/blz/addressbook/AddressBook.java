package com.blz.addressbook;

import java.util.ArrayList;

public class AddressBook {
    public static InterAddressBook impl = new DisplyOutput();
    public static String[] index = {"First Name", "Last Name", "Address", "City", "State", "Zip Code", "Mobile Number", "Email ID"};

    public static void main(String[] args) {
        ArrayList<String> fName = new ArrayList<>();
        ArrayList<String> sName = new ArrayList<>();
        ArrayList<String> adrs = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();
        ArrayList<String> state = new ArrayList<>();
        ArrayList<String> zipCode = new ArrayList<>();
        ArrayList<String> no = new ArrayList<>();
        ArrayList<String> mail = new ArrayList<>();

        ArrayList<ArrayList<String>> addBook = new ArrayList<>();
        addBook.add(fName);
        addBook.add(sName);
        addBook.add(adrs);
        addBook.add(city);
        addBook.add(state);
        addBook.add(zipCode);
        addBook.add(no);
        addBook.add(mail);

        System.out.print("How many Details you want to enter : ");
        int temp = UserInputUtils.intInput();
        for (int j = 0; j < temp; j++) {
            System.out.println("\nEnter Details below ...\n");
            for (int i = 0; i < 8; i++) {

                System.out.print("Enter your " + index[i] + " : ");
                addBook.get(i).add(UserInputUtils.stringInput());

            }

        }
        impl.Display(temp,addBook,index);
    }

}