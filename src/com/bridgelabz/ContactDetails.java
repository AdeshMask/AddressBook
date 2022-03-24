package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactDetails {
    ArrayList<PersonsInfo> persons;
    public ContactDetails(){
        persons = new ArrayList<PersonsInfo>();
    }
    public void addPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String name = scanner.nextLine();
        System.out.println("Enter Last Name");
        String lName = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter City Name: ");
        String city = scanner.nextLine();
        System.out.println("Enter State: ");
        String state = scanner.nextLine();
        System.out.println("Enetr Zip Code:");
        String zip = scanner.nextLine();
        System.out.println("Enter contact Number:");
        String number = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        PersonsInfo p = new PersonsInfo(name,lName,address,city,state,zip,number,email);
        p.print();
        persons.add(p);
    }
    public void search(){
        for (int i = 0; i < persons.size();i++)
        {
            PersonsInfo p = (PersonsInfo)persons.get(i);
            p.print();
            System.out.println(persons.get(i));
        }
    }
}
