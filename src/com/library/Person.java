package com.library;

public class Person {
	private String name;
	
	public Person(){
		name = "no name yet";
	}
	
	public Person(String initialName){
		this.name = initialName;
	}
	
	public void setName(String newName){
		this.name = newName;
	}

	public String getName(){
		return name;
	}
}
