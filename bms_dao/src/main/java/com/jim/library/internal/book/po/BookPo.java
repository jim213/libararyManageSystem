package com.jim.library.internal.book.po;

import com.jim.library.book.domain.BookQueryBo;
import com.jim.library.book.entity.Book;

public class BookPo extends Book {
	
	public BookQueryBo build() {
		BookQueryBo bo = new BookQueryBo(this);
		return bo;
	}
}
