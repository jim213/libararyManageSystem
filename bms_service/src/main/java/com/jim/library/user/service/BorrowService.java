package com.jim.library.user.service;

import com.jim.library.user.doamin.BorrowInfoBo;

public interface BorrowService {
	
	public void borrowBook(BorrowInfoBo borrowInfoBo) throws Exception;
	
	public void returnBook(BorrowInfoBo borrowInfoBo) throws Exception;
	
}
