package com.project.curd.daoimpl;

import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project.curd.config.HibernetUtil;
import com.project.curd.dao.CustomerDAO;
import com.project.curd.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	Scanner sc = new Scanner(System.in);
	@Override
	public void getCustomer() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			System.out.println("Enter Customer ID");
			int id = sc.nextInt();
			Customer cdCustomer = session.get(Customer.class, id);
			System.out.println("Customer Details are");
			System.out.println(cdCustomer.getId()+ " " + cdCustomer.getNameString()+ " " + cdCustomer.getEmailString()+ " " + cdCustomer.getMobile());
		    
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void addCustomer() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			Transaction transaction= session.beginTransaction();
			System.out.println("Enter Customer Email ID");
			String emailString1 = sc.next();
			System.out.println("Enter Customer Name");
			String nameString1 = sc.next();
			System.out.println("Enter Customer Mobile Number");
			long mobile1 = sc.nextLong();
			Customer c1 = new Customer();
			c1.setEmailString(emailString1);
			c1.setNameString(nameString1);
			c1.setMobile(mobile1);
			session.save(c1);
			transaction.commit();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateCustomer() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			Transaction transaction= session.beginTransaction();
			System.out.println("Enter Customer ID");
			int id = sc.nextInt();
			Customer cdCustomer = session.get(Customer.class, id);
			System.out.println("Enter Updated Mobile Number");
			long phone = sc.nextLong();
			cdCustomer.setMobile(phone);
			session.update(cdCustomer);
			transaction.commit();
			System.out.println("Updated Successfully");
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void deleteCustomer() {
		try {
			Session session = HibernetUtil.getSessionFactory().openSession();
			Transaction transaction= session.beginTransaction();
			System.out.println("Enter Customer ID");
			int id = sc.nextInt();
			Customer cdCustomer = session.get(Customer.class, id);
			session.delete(cdCustomer);
			transaction.commit();
			System.out.println("Deleted Successfully");
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
