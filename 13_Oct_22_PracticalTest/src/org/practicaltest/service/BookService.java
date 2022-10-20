package org.practicaltest.service;

import java.util.ArrayList;
import java.util.TreeSet;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.model.Book;

public class BookService {
	static ArrayList<Book> bookset = new ArrayList<>();
	public static void addBook(Book book) {
		BookDAO.addBook(book);
		
	}
	
	
	public static ArrayList<Book> displayBook(){
		return BookDAO.displayBook();
	}


	public static void searchByTitle(String titleString1) {
		System.out.println("printed");
		for(Book b : bookset){
	        if(titleString1.equalsIgnoreCase(Book.getTitle())){
	         System.out.println("Book is avaliable");
	        }
	        else {
	        	System.out.println("Book is not avaliable");
	        }
		}
	}


	public static void searchByAuthor(String authorString1) {
		for(Book b : bookset){
	        if(authorString1.equalsIgnoreCase(Book.getAuthor())){
	           System.out.println("Book is avaliable");
	        }
	        else {
	    System.out.println("Book is not avalible");
	        }
	    }
	}


	
}
