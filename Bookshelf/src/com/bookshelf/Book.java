package com.bookshelf;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Books")
public class Book implements Comparable <Book>{
	
	@Id
	private String title;
	
	
	private String author;
	private Boolean read;
	private int rating;
	private String genre;
	private int isbn;
	
	public Book(String author, String title){
		this.author = author;
		this.title = title;
		this.read = false;
		this.rating = 0;
		this.genre = "test";
		this.isbn = 000000;
	}
	public void addRating(String title, int rating){
		
	}
	
	public void addComment(String title, String comment){
		
	}
	
	public Boolean getRead() {
		return read;
	}
	public void setRead(Boolean read) {
		this.read = read;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
    public int compareTo(Book other){
    	return title.compareTo(other.getTitle());
	}
	
}
