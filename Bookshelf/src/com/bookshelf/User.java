package com.bookshelf;
import java.util.*;

public class User extends Person{
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
		int numRead = 0;
		for(int i=0; i<bookshelf.size();i++){
			if(bookshelf.get(i).getRead()){
				numRead = numRead + 1;
			}
		}
		return numRead;
	}
}
