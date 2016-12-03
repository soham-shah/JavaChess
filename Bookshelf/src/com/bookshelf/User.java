package com.bookshelf;
import java.util.*;

public class User extends Person{
	public int booksRead;
	public List<Book> bookshelf = new ArrayList<Book>();
	
	public User(String username, String password){
		super.username = username;
		super.password = password;
	}
	
	public void addBook(String title){
		
	}
	
	public void deleteBook(String title){
		
	}
	
	private void changePassword(String newPassword){
		this.password = newPassword;
	}
	
}
