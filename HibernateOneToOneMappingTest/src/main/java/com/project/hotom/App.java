package com.project.hotom;

import java.util.Scanner;

import com.project.hotom.daoimpl.PersonDAOImpl;

public class App 
{
	static  Scanner sc = new Scanner(System.in);
	public static void subMenu() {
		PersonDAOImpl personDAOImpl = new PersonDAOImpl();
		System.out.println("1. Add new passport details");
	       System.out.println("2. Display passport details");
	       System.out.println("Enter your choice");
	       int choice = sc.nextInt();
	       switch(choice) {
	       case 1: personDAOImpl.addPerson();
	       break;
	       case 2: personDAOImpl.displayPerson();
	       break;
	       default : System.out.println("Invalid Choice");
	       }
	}
    public static void main( String[] args )
    {
       System.out.println("Passport Details");
       System.out.println("1. Start System");
       System.out.println("2. End System");
       System.out.println("Enter your choice");
       int choice = sc.nextInt();
       do {
       switch(choice) {
       case 1 : subMenu();
       break;
       case 2 : System.exit(0);
       break;
       default : System.out.println("Invalid Choice");
       }
       }while(true);
       }
}
