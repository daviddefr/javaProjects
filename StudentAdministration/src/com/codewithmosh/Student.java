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
    private int courseCost = 600;
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

        //calling the enroll courses methode

    }

    //Generate the ID with the formula (5-digits with first number is the grade level "G-XXXX")
    public String getStudentID () {
        id++;
        return yearGrade + "-" + id;
    }

    //Enroll the courses
    public String enrollCourse () {
        int nbrOfCourses;
        String choiceConfirmation;
        ArrayList<String> coursesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
            while (true) {
                System.out.println("Enter number of courses you want to enroll on the list bellow :\n1 - History101.\n2 - Mathematics101.\n3 - English101.\n4 - Chemistry101.\n5 - Computer Science101.\nNumber of courses : ");
                nbrOfCourses = scanner1.nextInt();
            if (nbrOfCourses == 0){
                System.out.println("Sorry! you entered number " + nbrOfCourses + " !");
            } else if (nbrOfCourses == 1) {
                System.out.println("Your desire to enroll " + nbrOfCourses + " course! If you want to change the number of courses press C if you want to keep your choice press Y.");
                choiceConfirmation = scanner2.nextLine();
            } else {
            }
                System.out.println("Your desire to enroll " + nbrOfCourses + " courses! If you want to change the number of courses press C if you want to keep your choice press Y :");
                choiceConfirmation = scanner2.nextLine();
                if (choiceConfirmation.equals("y")){
                    break;
                }
            }
        for (int i = 0; i < nbrOfCourses; i++) {
            System.out.println("Enter the course n° " + (i + 1) + " to enroll.");
            String courses = scanner.nextLine();
            coursesList.add(courses);
            courseCost += 600;
        }
        String result = "You chose " + nbrOfCourses + " as enroll course(s).\nThe courses are :\n" + coursesList + "\nThe cost of courses to pay is : $" + courseCost;
        return result;
    }
}
