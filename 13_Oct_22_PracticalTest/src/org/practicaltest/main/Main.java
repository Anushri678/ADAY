package org.practicaltest.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.model.Book;
import org.practicaltest.view.BookView;


public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void addNewBook() {
		BookView.addBook();
	}
	
	public static void displayNewBook() {
		 ArrayList<Book> allbook = BookView.displayBook();
			for(Book i: allbook) {
				System.out.println(i);
				}
	}
	
	public static void searchBookBYTitle() {
		BookView.searchByTitle();
	}
	
	public static void searchBookByAuthor() {
		BookView.searchByAuthor();
	}
	public static void subMenu() {
		System.out.println("1. Add a new Book");
		System.out.println("2. Display all Book");
		System.out.println("3. Search book by it's title");
		System.out.println("4. Search book by it's author name");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: addNewBook();
		System.out.println("New Book is Added");
		break;
		case 2: displayNewBook();
		break;
		case 3 : searchBookBYTitle();
		break;
		case 4 : searchBookByAuthor();
		break;
		default : System.out.println("Invalid Choice");
		}
	}
public static void main(String[] args) {
	do {
		System.out.println("1. Start");
		System.out.println("2. Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: subMenu();
		break;
		case 2: System.exit(0);
		break;
		default : System.out.println("Invalid Choice");
		}
	} while (true);
}
}

