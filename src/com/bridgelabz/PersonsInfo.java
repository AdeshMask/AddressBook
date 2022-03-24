package com.bridgelabz;

import javax.swing.*;

public class PersonsInfo {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    static String number;
    String email;

    public PersonsInfo(String fname,String lname,String add, String ci,String st,String postalCode,String n,String mail){
        firstName = fname;
        lastName = lname;
        address = add;
        city = ci;
        state = st;
        zip = postalCode;
        number = n;
        email = mail;
    }
    public void print(){
        System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+
                "\nAddress: "+address+"\nCity:"+city+"\nState: "+state+"\nZip: "+zip+"\nContact number:"+number+"\nEmail ID:"+email+"\n");
    }
}
