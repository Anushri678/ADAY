package org.practicaltest.dao;


import java.util.TreeSet;

import org.practicaltest.model.Student;

public class StudentDAO {
static TreeSet<Student> stud= new TreeSet<>();
	public static boolean addStudent(Student student) {
		boolean result = false;
		for(int i=0; i<10; i++) {
			
			stud.add(student);
			result = true;
			
		}
		
		
		return result;
		
	}
	public static TreeSet<Student> displayStudent() {
		return stud;
	}

}
