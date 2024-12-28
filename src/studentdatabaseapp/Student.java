package studentdatabaseapp;

import java.util.Scanner;

/*
 * Ask the user how many new students will be added to the database
 * the user should be prompted to enter the name and year 
 * for each student
 * the student can enroll in the following courses (history 101, 
 * chemistry 101, computer science 101)
 * each course costs $600 to enroll
 * the student should be able to view balance and pay tuition
 * to see the status of the student, we should see their 
 * name, ID, courses enrolled, and balance*/


public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID; //unique studentID
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000; //class ID
	

	// Constructor: prompt user to enter student's name and year
	
	
	//Constructor: ask for first name
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
	
	//Constructor: ask for last name
	
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
	
	//Constructor: ask for graduation year
	
		System.out.print("Enter student class level.\n1- Freshmen\n2- for Sophmore\n3- for Junior \n4- for Senior. \nChoice: ");
		this.gradeYear = in.nextInt();
		
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
	
	
	// Generate an ID
	//it needs to be the static ID + grade number
	private void setStudentID() {
		// every time function is called id[0]=1000 will increment by 1 
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	
	// Enroll in courses
	
	public void enroll() {
		// get inside a loop, user hits 0
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (course != "Q") {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		System.out.print("ENROLLED IN: " + courses);
		System.out.print("TUITION BALANCE: " + tuitionBalance);
	}
	
	// View balance
	
	
	// Pay tuition
	
	// Show status
	
	
	
}
