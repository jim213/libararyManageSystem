package com.jim.library.internal.book.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jim.library.book.domain.BookQueryBo;
import com.jim.library.book.entity.Book;
import com.jim.library.book.service.BookService;
import com.jim.library.exception.BmsException;
import com.jim.library.internal.book.mapper.BookMapper;
import com.jim.library.internal.book.po.BookPo;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;

	@Override
	public BookQueryBo findBookByISBN(BookQueryBo bookQueryBo) throws Exception {
		BookPo bookPo = bookMapper.findBookByISBN(bookQueryBo);
		
		if(Objects.isNull(bookPo)) {
			throw new BmsException("查找的图书不存在，请核对ISBN号后重新查找！");
		}else {
		return bookPo.build();
		}
	}

	@Override
	public List<BookQueryBo> findBooksList(BookQueryBo bookQueryBo) throws Exception {
		 List<BookPo> list = bookMapper.findBooksList(bookQueryBo);
		 
		return null;
	}

	@Override
	public void addBook(BookQueryBo bookQueryBo) throws Exception {
		bookMapper.addBook(bookQueryBo);
		
	}

	@Override
	@Transactional
	public void updateBook(BookQueryBo bookQueryBo) throws Exception {
		bookMapper.updateBook(bookQueryBo);
		System.out.println(bookQueryBo.getBook());
		
	}

	@Override
	public void deleteBook(BookQueryBo bookQueryBo) throws Exception {
		bookMapper.deleteBook(bookQueryBo);
	}

}
