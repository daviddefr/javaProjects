package com.codewithmosh;

import java.util.Scanner;

public class Student {
    private int nbrStudent;

    //Constructor
    public Student(int nbrStudent) {
        this.nbrStudent = nbrStudent;
        //Calling the student list method
        studentList();
    }

    //Ask the user to enter the list of students
    public void studentList () {
        String[] studentName = new String[nbrStudent];
        int[] studentYear = new int[nbrStudent];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nbrStudent; i++) {
            System.out.print("Enter the name of the student n° " + (i + 1)  + " : ");
            String name = scanner.nextLine();
            studentName[i] = name;
            System.out.print("Enter the year of the student n° " + (i + 1) + " : ");
            int year = scanner.nextInt();
            studentYear[i] = year;
        }
    }
}
