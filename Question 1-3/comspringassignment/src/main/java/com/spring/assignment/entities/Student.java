package com.spring.assignment.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Omkar")
	private String name;
	@Value("10")
	private int id;
	@Value("India")
	private String country;
	
	
	public Student(String name, int id, String country) {
		super();
		this.name = name;
		this.id = id;
		this.country = country;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", country=" + country + "]";
	}
	
	
	

}
