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

        addressBook.DeleteData(addBook, temp);


    }

    public void DeleteData(ArrayList<ArrayList<String>> addBook, int temp) {
        while (true) {
            System.out.println("Do you want to delete data (y/n) : ");
            if (UserInputUtils.charInput() == 'y') {
                System.out.println("Enter First Name of contact to Delete : ");
                String firstName = UserInputUtils.stringInput();
                int contactIndex = -1;
                for (int i = 0; i < temp; i++) {
                    if (addBook.get(0).get(i).equals(firstName)) {
                        contactIndex = i;
                        break;
                    }
                }

                if (contactIndex != -1) {
                    for (int i = 0; i < 8; i++) {
                        addBook.get(i).remove(contactIndex);
                    }
                    temp = temp - 1;
                    impl.Display(temp, addBook, index);

                } else {
                    System.out.println("First name you Entered not Found ...");
                }
            } else {
                break;
            }
        }
    }
}