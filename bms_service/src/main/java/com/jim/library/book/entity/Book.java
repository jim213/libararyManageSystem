package com.jim.library.book.entity;

import java.util.Date;

public class Book {
	
	private String bookISBN;

	private String bookName;
	
	private String bookClass;
	
	private String author;
	
	private String publisher;
	
	private Date publishDate;
	
	private int bookAllQuan;
	
	private int bookQuan;
	
	private String pic;

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookClass() {
		return bookClass;
	}

	public void setBookClass(String bookClass) {
		this.bookClass = bookClass;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getBookAllQuan() {
		return bookAllQuan;
	}

	public void setBookAllQuan(int bookAllQuan) {
		this.bookAllQuan = bookAllQuan;
	}

	public int getBookQuan() {
		return bookQuan;
	}

	public void setBookQuan(int bookQuan) {
		this.bookQuan = bookQuan;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "Book [bookISBN=" + bookISBN + ", bookName=" + bookName + ", bookClass=" + bookClass + ", author="
				+ author + ", publisher=" + publisher + ", publishDate=" + publishDate + ", bookAllQuan=" + bookAllQuan
				+ ", bookQuan=" + bookQuan + "]";
	}
	
	
	

}
