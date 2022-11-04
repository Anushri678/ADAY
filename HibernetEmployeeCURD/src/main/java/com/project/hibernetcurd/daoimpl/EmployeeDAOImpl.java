package com.project.hibernetcurd.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.project.hibernetcurd.config.HibernetUtil;
import com.project.hibernetcurd.dao.EmployeeDAO;
import com.project.hibernetcurd.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	Scanner sc = new Scanner(System.in);
	public void getEmployee() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			System.out.println("Enter Customer ID");
			int id = sc.nextInt();
			Employee employee = session.get(Employee.class, id);
			System.out.println("Employee Details are");
			System.out.println(employee.getId()+ " " + employee.getNameString()+ " " + employee.getEmailString()+ " " + employee.getMobile()+ " " + employee.getAddressString());  
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public void addEmployee() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			Transaction transaction= session.beginTransaction();
			System.out.println("Enter Employee Email ID");
			String emailString1 = sc.next();
			System.out.println("Enter Employee Name");
			String nameString1 = sc.next();
			System.out.println("Enter Employee Mobile Number");
			long mobile1 = sc.nextLong();
			System.out.println("Enter Employee address");
			String addreString = sc.next();
			Employee e1 = new Employee();
			e1.setEmailString(emailString1);
			e1.setNameString(nameString1);
			e1.setMobile(mobile1);
			e1.setAddressString(addreString);
			session.save(e1);
			transaction.commit();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateEmployee() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			Transaction transaction= session.beginTransaction();
			System.out.println("Enter Customer ID");
			int id = sc.nextInt();
			Employee e = session.get(Employee.class, id);
			System.out.println("Enter Updated Mobile Number");
			long phone = sc.nextLong();
			e.setMobile(phone);
			session.update(e);
			transaction.commit();
			System.out.println("Updated Successfully");
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteEmployee() {
			try {
				Session session = HibernetUtil.getSessionFactory().openSession();
				Transaction transaction= session.beginTransaction();
				System.out.println("Enter Customer ID");
				int id = sc.nextInt();
				Employee e = session.get(Employee.class, id);
				session.delete(e);
				transaction.commit();
				System.out.println("Deleted Successfully");
				
			}catch (Exception e) {
				System.out.println(e);
			}
	}

}
