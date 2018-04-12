package com.jim.library.internal.user.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jim.library.book.domain.BookQueryBo;
import com.jim.library.book.entity.Book;
import com.jim.library.internal.book.mapper.BookMapper;
import com.jim.library.internal.book.po.BookPo;
import com.jim.library.internal.user.mapper.BorrowInfoMapper;
import com.jim.library.user.doamin.BorrowInfoBo;
import com.jim.library.user.entity.BorrowInfo;
import com.jim.library.user.service.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService {
	
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private BorrowInfoMapper borrowInfoMapper;
	 
	@Override
	@Transactional
	public void borrowBook(BorrowInfoBo borrowInfoBo) throws Exception {
		
		//根据输入查询数据库得到对应的BookQueryBo信息
		BookPo bookPoBySelect = bookMapper.findBookByISBN(borrowInfoBo.getBookQueryBo());
		
		//Book book = bookPoBySelect.getBook();
		
		int bookCurrentQuantity = bookPoBySelect.getBookQuan();
		
		//判断当前图书是否还有库存
		if(bookCurrentQuantity >0) {
			
			//数量更新
			bookCurrentQuantity--;
			
			bookPoBySelect.setBookQuan(bookCurrentQuantity);
			
			//更新到数据库的book表
			bookMapper.updateBook(bookPoBySelect.build());
		}else {
			//throw new BmsException("当前图书已全部借出！");
		}
		
		
		//产生一条记录，并信息插入到borrowinfo表中
		borrowInfoBo.setBookQueryBo(bookPoBySelect.build());
		
		BorrowInfo borrowInfo = new BorrowInfo();
		
		borrowInfo.setBorrowTime(new Date());
		
		borrowInfoBo.setBorrowInfo(borrowInfo);
		
		borrowInfoMapper.addRecord(borrowInfoBo);

	}


	@Override
	@Transactional
	public void returnBook(BorrowInfoBo borrowInfoBo) throws Exception {
		
		//通过输入的信息查找出borrowInfo表中对应的记录
		BorrowInfoBo borrowInfoBoBySelect = borrowInfoMapper.findRecord(borrowInfoBo);
		
		//更新borrowInfo表中对应的returnTime的值
		if (borrowInfoBoBySelect==null) {
//			throw new BmsException("未查到当前借书记录或已归还！");
		}
		
		borrowInfoBoBySelect.getBorrowInfo().setReturnTime(new Date());
		
		borrowInfoBo.setBorrowInfo(borrowInfoBoBySelect.getBorrowInfo());	
		
		borrowInfoMapper.updateRecord(borrowInfoBo);
		
		//将book表中对应的图书存量+1
		//根据BorrowInfo表中的bookISBN构造一个bookQueryBo，用于查询
		String tempISBN= borrowInfoBo.getBorrowInfo().getBookISBN();
		
		Book book = new Book();
		
		book.setBookISBN(tempISBN);	
		
		BookQueryBo bookQueryBo = new BookQueryBo();
		
		bookQueryBo.setBook(book);
		
		//从数据库查询出来的信息赋值给bookQueryBo，用于更新
		BookPo bookPo =  bookMapper.findBookByISBN(borrowInfoBo.getBookQueryBo());
		
		bookQueryBo = bookPo.build();
		
		int bookCurrentQuantity = book.getBookQuan();
		
		int bookTotallyQuantity = book.getBookAllQuan();
		
		if (bookCurrentQuantity<bookTotallyQuantity) {
			bookCurrentQuantity++;
		}
		
		book.setBookQuan(bookCurrentQuantity);
		bookQueryBo.setBook(book);
		
		//更新数据库
		bookMapper.updateBook(bookQueryBo);
	}

}
