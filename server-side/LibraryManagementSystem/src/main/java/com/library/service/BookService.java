package com.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.entity.Book;
import com.library.exception.ResourceNotFoundExceptionHandler;
import com.library.repository.IBookRepository;

@Service
public class BookService implements IBookService {

	@Autowired
	private IBookRepository bookRepository;

	@Override
	public Long createBook(Book book) {
		Book savedBook = bookRepository.save(book);
		return savedBook.getBookId();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBook(Long bookId) {
		return bookRepository.findById(bookId);
	}

	@Override
	public void removeBook(Long bookId) {
		bookRepository.deleteById(bookId);
	}

	@Override
	public Book updateBook(Book book, Long bookId) {
		Book existingBook = bookRepository.findById(bookId).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Book", "bookId", bookId));

		existingBook.setBookName(book.getBookName());
		existingBook.setBookAuthor(book.getBookAuthor());
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setBookGenre(book.getBookGenre());
		existingBook.setBookStatus(book.getBookStatus());

		bookRepository.save(existingBook);

		return existingBook;
	}

	@Override
	public Book changeStatus(Book book, Long bookId) {
		Book existingBook = bookRepository.findById(bookId).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Book", "bookId", bookId));

		existingBook.setBookStatus(book.getBookStatus());

		bookRepository.save(existingBook);

		return existingBook;
	}

}
