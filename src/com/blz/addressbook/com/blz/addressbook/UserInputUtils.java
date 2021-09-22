package com.blz.addressbook;

import java.util.Scanner;

public class UserInputUtils {
    private static final Scanner SC = new Scanner(System.in);

    public static int intInput() {
        return SC.nextInt();
    }

    public static String stringInput() {
        return SC.next();
    }
}