package com.digitalbooks.book.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {

	@Column(name = "BOOK-ID")
	private Integer bookId;
	@Column(name = "BOOK-TITLE")
	private String bookTitle;
	@Column(name = "BOOK-CATEGORY")
	private String bookCategory;
	@Column(name = "BOOK-PRICE")
	private double bookPrice;
	@Column(name = "BOOK-AUTHOR")
	private String bookAuthor;
	@Column(name = "BOOK-PUBLISHER")
	private String bookPublisher;
	@Column(name = "BOOK-PUBLISHDATE")
	private Date bookPublishDate;
	@Column(name = "BOOK-CONTENT")
	private String bookChaptersContent;
	@Column(name = "BOOK-ACTIVE")
	private boolean bookActive;
	@Column(name = "BOOK-LOGO")
	private byte[] bookLogo;


	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public Date getBookPublishDate() {
		return bookPublishDate;
	}
	public void setBookPublishDate(Date bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}
	public String getBookChaptersContent() {
		return bookChaptersContent;
	}
	public void setBookChaptersContent(String bookChaptersContent) {
		this.bookChaptersContent = bookChaptersContent;
	}
	public boolean isBookActive() {
		return bookActive;
	}
	public void setBookActive(boolean bookActive) {
		this.bookActive = bookActive;
	}
	public byte[] getBookLogo() {
		return bookLogo;
	}
	public void setBookLogo(byte[] bookLogo) {
		this.bookLogo = bookLogo;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String bookTitle, String bookCategory, double bookPrice, String bookAuthor,
			String bookPublisher, Date bookPublishDate, String bookChaptersContent, boolean bookActive,
			byte[] bookLogo) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookCategory = bookCategory;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookPublishDate = bookPublishDate;
		this.bookChaptersContent = bookChaptersContent;
		this.bookActive = bookActive;
		this.bookLogo = bookLogo;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookCategory=" + bookCategory + ", bookPrice="
				+ bookPrice + ", bookAuthor=" + bookAuthor + ", bookPublisher=" + bookPublisher + ", bookPublishDate="
				+ bookPublishDate + ", bookChaptersContent=" + bookChaptersContent + ", bookActive=" + bookActive
				+ ", bookLogo=" + Arrays.toString(bookLogo) + "]";
	}


}
