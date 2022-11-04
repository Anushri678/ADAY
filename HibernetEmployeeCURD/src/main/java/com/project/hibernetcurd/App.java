package com.project.hibernetcurd;

import java.util.Scanner;
import com.project.hibernetcurd.daoimpl.EmployeeDAOImpl;


public class App 
{
	static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        EmployeeDAOImpl employee = new EmployeeDAOImpl();
        char a;
        do {
        	System.out.println("Customer Management");
        	System.out.println("1. Create Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("Enter your choice");
            int i = sc.nextInt();
            switch(i) {
            case 1: employee.addEmployee();
            break;
            case 2: employee.getEmployee();
            break;
            case 3: employee.updateEmployee();
            break;
            case 4: employee.deleteEmployee();
            break;
            case 5: System.exit(0);
            break;
            default : System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to continue? Y/N");
            a = sc.next().charAt(0);
        }while(a=='Y' || a=='y') ;
        
    }
}
