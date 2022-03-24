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
            System.out.println(" Enter 1 to add\n");
             ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    contact.addPerson();
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }

}
