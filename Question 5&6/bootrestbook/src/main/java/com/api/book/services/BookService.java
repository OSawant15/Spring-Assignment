package com.api.book.services;

import com.api.book.entities.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookService {
	private static List<Book> list = new ArrayList<Book>();
	
	static {
		list.add(new Book(10,"Harry Potter","Omkar"));
		list.add(new Book(20,"Jumanji","Sam"));
		list.add(new Book(10,"Seaworld","John"));
		
	}
	
	public List<Book> getAllBooks(){
		
		return list;
	}
	
	
	

}
