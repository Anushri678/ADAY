package employee.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import employee.dao.EmployeeDAO;
import employee.model.Employee;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void subMenu() {
		Employee employee = new Employee();
		System.out.println("1. Create new employee");
		System.out.println("2. Update existing employee");
		System.out.println("3. Display existing employee");
		System.out.println("4. Delete existing");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: EmployeeDAO.createEmployee();
		break;
		case 2: EmployeeDAO.updateEmployee(employee);
		break;
		case 3: EmployeeDAO.displayEmployee(employee);
		break;
		case 4: EmployeeDAO.deleteEmployee();
		break;
		default : System.out.println("Invalid choice");
		}
	}
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/temp","root","Password@123");
		do {
			System.out.println("1. Start System");
			System.out.println("2. Stop System");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: subMenu();
			break;
			case 2: System.exit(0);
			}
		} while (true);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
