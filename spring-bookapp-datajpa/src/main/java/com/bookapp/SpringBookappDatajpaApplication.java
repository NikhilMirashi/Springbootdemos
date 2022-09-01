package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappDatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappDatajpaApplication.class, args);
	}

	
	IBookService bookService;
	
	@Autowired
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	
	@Override
	public void run(String... args) throws Exception {

		//Book book=new Book("Java in You",1,"Nikhil","Tech",1900);
//		Book book=new Book("Sprint in Action",1,"Kathy","Tech",2900);
//		bookService.addBook(book);
//		
//		bookService.getAll().forEach(System.out::println);
//		
//		Book newBook=bookService.getById(100);
//		System.out.println(newBook);
//		newBook.setAuthor("Games Gossling");
//		bookService.updateBook(newBook);
//		
//		bookService.deleteBook(103);
		
		//bookService.getByAuthor("Kathy").forEach(System.out::println);
		
		//getting data
		bookService.getByPriceLessThan(3000).forEach(System.out::println);
		
	}

	

}
