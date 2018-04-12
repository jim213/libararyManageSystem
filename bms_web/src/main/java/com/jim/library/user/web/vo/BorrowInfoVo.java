package com.jim.library.user.web.vo;

import com.jim.library.book.web.vo.BookQueryVo;
import com.jim.library.user.doamin.BorrowInfoBo;
import com.jim.library.user.entity.BorrowInfo;

public class BorrowInfoVo {
	
	private BorrowInfo borrowInfo;
	
	private UserVo userVo;
	
	private BookQueryVo bookQueryVo;
	
	public BorrowInfo getBorrowInfo() {
		return borrowInfo;
	}
	public void setBorrowInfo(BorrowInfo borrowInfo) {
		this.borrowInfo = borrowInfo;
	}
	public UserVo getUserVo() {
		return userVo;
	}
	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}
	public BookQueryVo getBookQueryVo() {
		return bookQueryVo;
	}
	public void setBookQueryVo(BookQueryVo bookQueryVo) {
		this.bookQueryVo = bookQueryVo;
	}
	
	public BorrowInfoBo build() {
		BorrowInfoBo bo = new BorrowInfoBo();
		bo.setBorrowInfo(borrowInfo);
		bo.setUserBo(userVo.build());
		bo.setBookQueryBo(bookQueryVo.build());
		return bo;
	}
}
