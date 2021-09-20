package com.blz.addressbook;

import java.util.ArrayList;

public class AddressBook {
    public static String[] index = {"First Name", "Last Name", "Address", "City", "State", "Zip Code", "Mobile Number", "Email ID"};
    static InterAddressBook impl = new DisplyOutput();
    static AddressBook addressBook = new AddressBook();


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

        InterAddressBook impl2 = new UserInput();
        impl2.UserInputs(temp, addBook, index);

        impl.Display(temp, addBook, index);

        addressBook.Edit(addBook, temp);


    }

    public void Edit(ArrayList<ArrayList<String>> addBook, int temp) {
        System.out.println("Enter First Name of contact to Edit : ");
        String firstName = UserInputUtils.stringInput();
        int contactIndex = -1;
        for (int i = 0; i < temp; i++) {
            if (addBook.get(0).get(i).equals(firstName)) {
                contactIndex = i;
                break;
            }

        }
        if (contactIndex != -1) {
            System.out.println("0.First Name ,1.Last Name ,2.Address ,3.City ,4.State ,5.Zip Code ,6.Mobile Number ,7.Email ID ,8.All Details ");
            System.out.println("Press following number to Edit specific Field : ");
            int selected = UserInputUtils.intInput();
            if (selected <= 7) {
                System.out.print("Enter your " + index[selected] + " : ");
                addBook.get(selected).set(contactIndex, UserInputUtils.stringInput());
                impl.Display(temp, addBook, index);
                addressBook.Recurring(addBook, temp);
            }
            if (selected == 8) {
                for (int i = 0; i < 8; i++) {
                    System.out.print("Enter your " + index[i] + " : ");
                    addBook.get(i).set(contactIndex, UserInputUtils.stringInput());
                }
                impl.Display(temp, addBook, index);
                addressBook.Recurring(addBook, temp);
            }
        }
    }

    public void Recurring(ArrayList<ArrayList<String>> addBook, int temp) {
        System.out.println("Do you want to perform edit operation (y/n) : ");
        if (UserInputUtils.charInput() == 'y') {
            Edit(addBook, temp);
        }
    }

}