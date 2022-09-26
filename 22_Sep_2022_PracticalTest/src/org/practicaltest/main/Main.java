package org.practicaltest.main;

import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.model.Student;
import org.practicaltest.view.StudentView;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void subMenu() {
		System.out.println("1. Add a new Student");
		System.out.println("2. Display all Students");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: StudentView.addStudent();
		System.out.println("New Student is Added");
		break;
		case 2: TreeSet<Student> allStudents = StudentView.displayStudent();
		for(Student i: allStudents) {
			
				System.out.println(i);
			
		}
		break;
		default : System.out.println("Invalid Choice");
		}
	}
 public static void main(String[] args) {
	do {
		System.out.println("1. Start");
		System.out.println("2. Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: subMenu();
		break;
		case 2: System.exit(0);
		break;
		default : System.out.println("Invalid Choice");
		}
	} while (true);
}
}
