package org.practicaltest.service;


import java.util.TreeSet;

import org.practicaltest.dao.StudentDAO;
import org.practicaltest.model.Student;

public class StudentService {

	public static void addStudent(Student student) {
		StudentDAO.addStudent(student);
		
	}

	public static TreeSet<Student> displayStudent() {
		return StudentDAO.displayStudent();
	}

}
