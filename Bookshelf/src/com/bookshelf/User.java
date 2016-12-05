package com.bookshelf;
import java.util.*;

public class User extends Person{
	private int booksRead = 0;
	public List<Book> bookshelf = new ArrayList<Book>();
	
	public User(String username, String password){
		super.username = username;
		super.password = password;
	}
	
	public void addBook(Book newBook){
			bookshelf.add(newBook);
	}
	
	public void deleteBook(int index){
		bookshelf.remove(index-1);
	}
	
	private void changePassword(String newPassword){
		this.password = newPassword;
	}

	public int bookCount(){
		return bookshelf.size();
	}
	
	public int getBooksRead(){
		return booksRead;
	}
	
	public void addReadBook(){
		booksRead = booksRead+1;
	}
	
}
