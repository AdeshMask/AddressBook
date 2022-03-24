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

        //construct new person object
        PersonsInfo p = new PersonsInfo(name,lName,address,city,state,zip,number,email);
        //add the above PersonInfo object to arraylist
        persons.add(p);
    }
    public void show(){
        for (int i = 0; i < persons.size();i++)
        {
            PersonsInfo p = (PersonsInfo)persons.get(i);
         //   p.print();
            System.out.println(persons.get(i));
        }
    }

    public void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name to delete contact:");
        String name = scanner.nextLine();
        for(int i = 0; i < persons.size(); i++){
            PersonsInfo p = (PersonsInfo)persons.get(i);
            if(name.equals(p.firstName)){
                persons.remove(i); }
        }


    }//remove function
}
