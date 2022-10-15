package org.practicaltest.dao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.model.Book;
import org.practicaltest.view.BookView;


public class BookDAO {
	static Scanner sc = new Scanner(System.in);
static ArrayList<Book> bookset = new ArrayList<>();
public static boolean addBook(Book book) {
	boolean result = false;
	
		bookset.add(book);
		result = true;
		
	return result;
	}




public static ArrayList<Book> displayBook() {
	return bookset;
}






}

