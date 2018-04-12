package com.jim.library.user.entity;


import java.util.Date;

public class BorrowInfo {
	
	private int borrowInfoNumber;
	
	private int userId;
	
	private String bookISBN;
	
	private Date borrowTime;
	
	private Date returnDeadline;
	
	private Date returnTime;

	public int getBorrowinfoNumber() {
		return borrowInfoNumber;
	}

	public void setBorrowinfoNumber(int borrowinfoNumber) {
		this.borrowInfoNumber = borrowinfoNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public Date getBorrowTime() {
		return borrowTime;
	}

	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}

	public Date getReturnDeadline() {
		return returnDeadline;
	}

	public void setReturnDeadline(Date returnDeadline) {
		this.returnDeadline = returnDeadline;
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	@Override
	public String toString() {
		return "BorrowInfo [borrowinfoNumber=" + borrowInfoNumber + ", userId=" + userId + ", bookISBN=" + bookISBN
				+ ", borrowTime=" + borrowTime + ", returnDeadline=" + returnDeadline + ", returnTime=" + returnTime
				+ "]";
	}
	
	
	
	
	
}
