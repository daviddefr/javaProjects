package com.codewithmosh;

import javax.swing.*;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int passwordLength = 10;
    private String company = "tui.com";
    private String email;

    //Declare a Constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call a methode that return the department by the user
        this.department = setDepartment();

        //Generating the email
        email = "Your email is : " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + company.toLowerCase();

        // call a methode that generate a random password
        this.password = setPassword(passwordLength);


    }

    //Ask for the department
    private String setDepartment() {
        Scanner scanner = new Scanner(System.in);
        String depSelection;
        while (true) {
            System.out.print("1 - Sales.\n2 - Development.\n3 - Accounting.\n0 - None.\nSelect your department : ");
            depSelection = scanner.nextLine();
            if (depSelection.equals("1") || depSelection.equals("2") || depSelection.equals("3") || depSelection.equals("0")){
                break;
            } else
                System.out.println("Enter a valid code of department as mentioned please!");
        }
            if (depSelection.equals("1")) {
                return "Sales";
            } else if (depSelection.equals("2")) {
                return "Development";
            } else if (depSelection.equals("3")) {
                return "Accounting";
            } else
                return "";
    }

    //Password generator
    private String setPassword(int length){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789^$?!@#%&";
        char[] psw = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int)(Math.random() * characters.length());
            psw[i] = characters.charAt(rand);
        }
        return new String(psw);
    }

    //Showing the info
    public String showInfo() {
        return "The full name : " + firstName + " " + lastName +
                "\nThe department is : " + department +
                "\nThe email is : " + email +
                "\nThe password is : " + password;
    }
}
