package com.project.curd;

import java.util.Scanner;
import com.project.curd.daoimpl.CustomerDAOImpl;
public class App 
{
	static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        CustomerDAOImpl cDaoImpl= new CustomerDAOImpl();
        char a;
        do {
        	System.out.println("Customer Management");
        	System.out.println("1. Create Customer");
            System.out.println("2. Display Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("Enter your choice");
            int i = sc.nextInt();
            switch(i) {
            case 1: cDaoImpl.addCustomer();
            break;
            case 2: cDaoImpl.getCustomer();
            break;
            case 3: cDaoImpl.updateCustomer();
            break;
            case 4: cDaoImpl.deleteCustomer();
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

