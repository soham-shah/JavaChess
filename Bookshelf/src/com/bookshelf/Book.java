package com.bookshelf;

public class Book implements Comparable <Book>{
	private Boolean read;
	private String author;
	private String title;
	private String rating;
	private String genre;
	private int isbn;
	
	public Book(String author, String title){
		this.author = author;
		this.title = title;
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
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
