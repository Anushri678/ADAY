package employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import employee.model.Employee;

public class EmployeeDAO {
	static Scanner sc = new Scanner(System.in);
	public static void createEmployee() {
		try{
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/temp","root","Password@123");
		PreparedStatement pstm = connection.prepareStatement("insert into employee values (?,?,?,?,?,?)");
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name= sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Employee Mobile Number");
		String mobile= sc.nextLine();
		System.out.println("Enter Employee Address");
		String address= sc.nextLine();
		System.out.println("Enter Employee Email-Id");
		String email= sc.nextLine();
		System.out.println("Enter Employee Department");
		String department= sc.nextLine();

	pstm.setInt(1, id);
	pstm.setString(2, name);
	pstm.setString(3, mobile);
	pstm.setString(4, address);
	pstm.setString(5, email);
	pstm.setString(6, department);
	pstm.execute();
	Employee employee = new Employee(id, name, mobile, address, email, department);
	System.out.println("New employee created Successfully");

    pstm.close();
	connection.close(); 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
}

	
public static void displayEmployee(Employee employee) {
	try {
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/temp","root","Password@123");
	PreparedStatement pstm = connection.prepareStatement("insert into employee values (?,?,?,?,?,?)");
	ResultSet resultSet = pstm.executeQuery("select * from employee");
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+resultSet.getString(3)+resultSet.getString(4)+resultSet.getString(5)+resultSet.getString(6));
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
}


public static void updateEmployee(Employee employee) {
	try {
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/temp","root","Password@123");
		String sql = "UPDATE employee SET emp_name=?, emp_mobile=? WHERE emp_id=?";
		PreparedStatement pstm = connection.prepareStatement(sql);
		System.out.println("Enter employee id of which information has to update");
		int emp_id = sc.nextInt();
		System.out.println("Enter employee name has to be update");
		String emp_name= sc.next();
		System.out.println("Enter employee mobile number has to be update");
		String emp_mobile= sc.next();
		pstm.setInt(1, emp_id);
		pstm.setString(2, emp_name);
		pstm.setString(3, emp_mobile);
	    pstm.executeUpdate();
	    System.out.println("An existing employee was updated successfully");
	}catch (Exception e) {
			e.printStackTrace();
 }
}


public static void deleteEmployee() {
	try {
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/temp","root","Password@123");
		String sql = "DELETE FROM employee WHERE emp_id=?";
		PreparedStatement pstm = connection.prepareStatement(sql);
		System.out.println("Enter employee id of which information has to be delete");
		int id = sc.nextInt();
		pstm.setInt(1, id);
		int rowsDeleted = pstm.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("A employee was deleted successfully");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
}
}
