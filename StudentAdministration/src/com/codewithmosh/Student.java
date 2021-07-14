package com.codewithmosh;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int nbrStudent;
    private String firstName;
    private String lastName;
    private int yearGrade;
    private int id = 1000;
    private String generatedID;
    //Constructor
    public Student() {

        // Asking the user for the full name and the grade
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name of the student : ");
        String fName = scanner.nextLine();
        this.firstName = fName;

        System.out.print("Enter the last name of the student : ");
        String lName = scanner.nextLine();
        this.lastName = lName;

        System.out.print("Year grade :\n1 - Freshmen.\n2 - Sophomore.\n3 - Junior.\n4 - Senior.\nEnter the grade of the student : ");
        int yGrade = scanner.nextInt();
        this.yearGrade = yGrade;

        //Calling the getStudentID methode
        this.generatedID = getStudentID();

        System.out.println("The details are :\nFirst name: " + firstName + "\nLast name: " + lastName + "\nThe ID : " + generatedID);
    }

    //Generate the ID with the formula (5-digits with first number is the grade level "G-XXXX")
    public String getStudentID () {
        id++;
        return yearGrade + "-" + id;
    }
}
