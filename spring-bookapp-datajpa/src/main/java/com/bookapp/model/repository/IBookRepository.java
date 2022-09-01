package com.bookapp.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

	// derived queries
	List<Book> findByCategory(String category);

	List<Book> findByAuthor(String author);

	List<Book> findByPriceLessThan(double price);
}
