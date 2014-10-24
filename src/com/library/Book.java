package com.library;

public class Book {
	private String name;
	private String author;
	private int isbn;
	
	//Constructors
	public Book(){
		this.name = "no name";
		this.author = "no author";
		this.isbn = 0;
	}
	
	public Book(String name, String author, int isbn){
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}
	
	//Mutator methods
	public void setName(String newName){
		this.name = newName;
	}
	
	public void setAuthor(String newAuthor){
		this.name = newAuthor;
	}
	
	public void setName(int isbn){
		this.isbn = isbn;
	}
	
	public void setName(String name, String author, int isbn){
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}
	
	//Accessor methods
	public String getName(){
		return name;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getIsbn(){
		return isbn;
	}
	
	
}
