package com.jim.library.book.domain;

import com.jim.library.book.entity.Book;

public class BookQueryBo {
	
	private Book book ;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookQueryBo(Book book) {
		super();
		this.book = book;
	}

	public BookQueryBo() {
		super();
	}

	@Override
	public String toString() {
		return "BookQueryBo [book=" + book + "]";
	}

	


	
}
