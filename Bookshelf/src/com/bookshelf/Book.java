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
	private String isbn;
	private String comment;
	
	public Book(){
		this.author = "";
		this.title = "";
		this.read = false;
		this.rating = 0;
		this.genre = "test";
		this.isbn = "000000";
	}

	public Book(String title, String author, String genre, String isbn, boolean read, int rating, String comment){
		this.author = author;
		this.title = title;
		this.read = read;
		this.rating = rating;
		this.genre = genre;
		this.isbn = isbn;
		this.comment = comment;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
    public int compareTo(Book other){
    	return title.compareTo(other.getTitle());
	}
	
}
