package com.jim.library.user.doamin;

import com.jim.library.book.domain.BookQueryBo;
import com.jim.library.user.entity.BorrowInfo;

public class BorrowInfoBo {
	
	private BorrowInfo borrowInfo;
	
	private UserBo userBo;
	
	private BookQueryBo bookQueryBo;

	public BorrowInfo getBorrowInfo() {
		return borrowInfo;
	}

	public void setBorrowInfo(BorrowInfo borrowInfo) {
		this.borrowInfo = borrowInfo;
	}

	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public BookQueryBo getBookQueryBo() {
		return bookQueryBo;
	}

	public void setBookQueryBo(BookQueryBo bookQueryBo) {
		this.bookQueryBo = bookQueryBo;
	}
	
	
	

	
	
	
	
}
