package com.project.hotom;

import java.util.Scanner;

import com.project.hotom.daoimpl.PersonDAOImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
       Scanner sc = new Scanner(System.in);
       PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       System.out.println("Passport Details");
       System.out.println("1. Add new passport details");
       System.out.println("2. Display passport details");
       System.out.println("Enter your choice");
       int choice = sc.nextInt();
       do {
       switch(choice) {
       case 1: personDAOImpl.addPerson();
       break;
       case 2: personDAOImpl.displayPerson();
       break;
       default : System.out.println("Invalid Choice");
       }
       }while(true);
       
       
}
}
