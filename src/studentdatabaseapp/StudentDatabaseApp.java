package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many new students we want to add
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		
		
		
		
		// Create n number of new students
		// Array of objects
		Student[] students = new Student[numOfStudents];
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();	
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
		
	
		
		
		
		
		
		
		
		
		
		/*WE DO NOT WANT THIS: 
		 * Student stu2 = new Student();
		stu2.enroll();
		stu2.payTuition();
		System.out.println(stu2.toString());
		
		Student stu3 = new Student();
		stu3.enroll();
		stu3.payTuition();
		System.out.println(stu3.toString());
		*/
		
	}

}
