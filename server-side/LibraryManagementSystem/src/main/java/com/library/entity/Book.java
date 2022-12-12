package com.library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	private String bookName;
	private String bookAuthor;
	private float bookPrice;
	private String bookGenre;
	private Boolean bookStatus;
	
	public Book(Long bookId, String bookName, String bookAuthor, float bookPrice, String bookGenre,
			Boolean bookStatus) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookGenre = bookGenre;
		this.bookStatus = bookStatus;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookGenre=" + bookGenre + ", bookStatus=" + bookStatus + "]";
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public Boolean getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(Boolean bookStatus) {
		this.bookStatus = bookStatus;
	}
	

}
