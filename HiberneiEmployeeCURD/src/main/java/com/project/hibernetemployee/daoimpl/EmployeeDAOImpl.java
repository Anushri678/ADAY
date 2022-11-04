package com.project.hibernetemployee.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project.hibernetemployee.config.HibernetUtil;
import com.project.hibernetemployee.dao.EmployeeDAO;
import com.project.hibernetemployee.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	Scanner sc = new Scanner(System.in);
	@Override
	public void getEmployee() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			System.out.println("Enter Customer ID");
			int id = sc.nextInt();
			Employee employee = session.get(Employee.class, id);
			System.out.println("Customer Details are");
			System.out.println(employee.+ " " + employee.getNameString()+ " " + cdCustomer.getEmailString()+ " " + cdCustomer.getMobile()+ " " + cdCustomer.getAddressString());
		    
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void addEmployee() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			Transaction transaction= session.beginTransaction();
			String name, email;
			long mobile;
			System.out.println("Enter Customer Email ID");
			String emailString1 = sc.next();
			System.out.println("Enter Customer Name");
			String nameString1 = sc.next();
			System.out.println("Enter Customer Mobile Number");
			long mobile1 = sc.nextLong();
			Employee e1 = new Employee();
			e1.
			e1.setNameString(nameString1);
			e1.setMobile(mobile1);
			session.save(e1);
			transaction.commit();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
