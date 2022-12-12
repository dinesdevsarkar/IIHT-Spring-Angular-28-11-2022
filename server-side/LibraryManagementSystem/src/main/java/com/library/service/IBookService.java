package com.library.service;

import java.util.List;
import java.util.Optional;

import com.library.entity.Book;

public interface IBookService {
	
	Long createBook(Book book);

	public List<Book> getAllBooks();
	
	Optional<Book> getBook(Long bookId);
	
	public void removeBook(Long bookId);
	
	Book updateBook(Book book, Long bookId);
	
	Book changeStatus(Book book, Long bookId);

}
