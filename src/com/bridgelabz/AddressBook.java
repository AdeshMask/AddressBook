package com.bridgelabz;

import javax.swing.*;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_*_*_*_*_Welcome to Address Book_*_*_*_*_*_*_*_*_*_*");
        ContactDetails contact = new ContactDetails();
        String name;
        int ch;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Enter 1 to add\n Enter 2 to Update\n Enter 3 to Delete\n Enter 4 for Show Contacts");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    contact.addPerson();
                    System.out.println("Added Successfully...");
                    break;
                case 2:
                    contact.update();
                    break;
                case 3:
                    contact.delete();
                    break;
                case 4 :
                    System.out.println("");
                    System.out.println("               "+"First Name "+" Last Name"+" Address"+" City"+" State"+" Zip"+" Number"+" E-mail");
                    contact.show();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

}
