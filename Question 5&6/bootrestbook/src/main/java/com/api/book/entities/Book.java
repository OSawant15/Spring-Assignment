package com.api.book.entities;

public class Book {
	private int id;
	private String titleString;
	private String author;
	public Book(int id, String titleString, String author) {
		super();
		this.id = id;
		this.titleString = titleString;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", titleString=" + titleString + ", author=" + author + "]";
	}
	
	
	

}
