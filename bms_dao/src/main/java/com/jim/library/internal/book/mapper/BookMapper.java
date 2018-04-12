package com.jim.library.internal.book.mapper;

import java.util.List;

import com.jim.library.book.domain.BookQueryBo;
import com.jim.library.book.entity.Book;
import com.jim.library.internal.book.po.BookPo;

public interface BookMapper {
	
	public BookPo findBookByISBN(BookQueryBo bookQueryBo) throws Exception;
	
	public List<BookPo> findBooksList(BookQueryBo bookQueryBo) throws Exception;
	
	public void addBook(BookQueryBo bookQueryBo) throws Exception;
	
	public void updateBook(BookQueryBo bookQueryBo) throws Exception;
	
	public void deleteBook(BookQueryBo bookQueryBo) throws Exception;

}
