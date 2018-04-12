package com.jim.library.book.web.vo;

import com.jim.library.book.domain.BookQueryBo;
import com.jim.library.book.entity.Book;

public class BookQueryVo {

	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookQueryVo(Book book) {
		super();
		this.book = book;
	}

	public BookQueryVo() {
		super();
	}

	public BookQueryBo build() {
		BookQueryBo bo = new BookQueryBo();
		bo.setBook(book);
		return bo;
	}

}
