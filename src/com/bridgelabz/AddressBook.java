package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    static String firstName;
    static String lastName;
    String address;
    String city;
    String state;
    static int zip;
    static String number;
    String email;

    static void userData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Users First Name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter User Last Name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter User Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter User City: ");
        String city = scanner.nextLine();
        System.out.println("Enter User State: ");
        String state = scanner.nextLine();
        System.out.println("Enter User Zip: ");
        zip= scanner.nextInt();
        System.out.println("Enter User Number: ");
        number = scanner.nextLine();
        System.out.println("Enter User E-mail: ");
        String email = scanner.nextLine();

    }
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_*_*_*_*_Welcome to Address Book_*_*_*_*_*_*_*_*_*_*");
        AddressBook addressBook = new AddressBook();

    }
}
