package com.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.library.entity.Book;
import com.library.service.IBookService;

@RestController
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	
	@PostMapping("/add/book")
	Long createBook(@RequestBody Book book) {
		Long bookid = bookService.createBook(book);
		System.out.println(bookid);
		return bookid;
	}
	
	@GetMapping("/read/{bookId}")
	public Optional<Book> getBook(@PathVariable Long bookId){
		return bookService.getBook(bookId);
	}

	@GetMapping("/allbooks")
	public List<Book> getBooks(){
		return bookService.getAllBooks();	
	}
	
	@PutMapping("/update/{bookId}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable Long bookId){
		return new ResponseEntity<Book>(bookService.updateBook(book, bookId), HttpStatus.OK);

	}
	
	@PatchMapping("/borrow/{bookId}")
	public ResponseEntity<Book> updateStatus(@RequestBody Book book, @PathVariable Long bookId){
		return new ResponseEntity<Book>(bookService.changeStatus(book, bookId), HttpStatus.OK);

	}

	@DeleteMapping("/remove/{bookId}")
	public ResponseEntity<Book> removeBook(@PathVariable Long bookId){
		System.out.println(bookId);
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			bookService.removeBook(bookId);
		}catch(Exception e){
			e.printStackTrace();
			responseEntity = new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

}
