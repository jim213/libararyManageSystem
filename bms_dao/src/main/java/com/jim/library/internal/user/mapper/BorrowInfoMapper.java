package com.jim.library.internal.user.mapper;

import com.jim.library.user.doamin.BorrowInfoBo;

public interface BorrowInfoMapper {

	public BorrowInfoBo findRecord(BorrowInfoBo borrowInfoBo)  throws Exception;
	
	public void addRecord(BorrowInfoBo borrowInfoBo)  throws Exception;
	
	public void updateRecord(BorrowInfoBo borrowInfoBo)  throws Exception;
	
	
}
