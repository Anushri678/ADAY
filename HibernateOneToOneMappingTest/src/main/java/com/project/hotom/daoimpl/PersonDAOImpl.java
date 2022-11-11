package com.project.hotom.daoimpl;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.project.hotom.config.HibernateUtil;
import com.project.hotom.dao.PersonDAO;
import com.project.hotom.entity.Passport;
import com.project.hotom.entity.Person;

public class PersonDAOImpl implements PersonDAO{
    static Scanner sc = new Scanner(System.in);
	@Override
	public void addPerson() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction= session.beginTransaction();
			System.out.println("Enter Person Name : ");
			String nameString = sc.next();
			System.out.println("Enter Person Email ID");
			String emailString = sc.next();
			System.out.println("Enter Person Mobile Number");
			long mobile = sc.nextLong();
			Person person = new Person();
			person.setNameString(nameString);
			person.setEmailString(emailString);
			person.setMobile(mobile);
			
			System.out.println("Enter Passport Number");
			long id = sc.nextLong();
			System.out.println("Enter Place of Birth");
			String addressString = sc.next();
			System.out.println("Enter Date of Issue");
			String dateOfIssueString = sc.next();
			System.out.println("Enter Expire Date");
			String expireDateString = sc.next();
			Passport passport = new Passport();
			passport.setIdproof(id);
			passport.setPlaceOfBirthString(addressString);
			passport.setDateOfIssueDate(LocalDate.parse(expireDateString));
			passport.setExpireDate(LocalDate.parse(expireDateString));
			person.setPassport(passport);
			
			session.save(person);
			transaction.commit();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void displayPerson() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			TypedQuery query = session.createQuery("from Person");
			List<Person> l1 = query.getResultList();
			
			Iterator<Person> itrIterator = l1.iterator();
			while(itrIterator.hasNext()) {
				Person person = itrIterator.next();
				System.out.println(person.getNameString() + " " + person.getMobile());
				Passport passport = person.getPassport();
				System.out.println(passport.getPlaceOfBirthString() + " " + passport.getDateOfIssueDate() + " " + passport.getExpireDate());
			}
			}catch (Exception e) {
				System.out.println(e);
			}
			
	}
	
}
