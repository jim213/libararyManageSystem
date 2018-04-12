package com.jim.library.book.service;

import java.util.List;
import com.jim.library.book.domain.BookQueryBo;

public interface BookService {
	
	public BookQueryBo findBookByISBN(BookQueryBo bookQueryBo) throws Exception;
	
	public List<BookQueryBo> findBooksList(BookQueryBo bookQueryBo) throws Exception;
	
	public void addBook(BookQueryBo bookQueryBo) throws Exception;
	
	public void updateBook(BookQueryBo bookQueryBo) throws Exception;
	
	public void deleteBook(BookQueryBo bookQueryBo) throws Exception;

}
