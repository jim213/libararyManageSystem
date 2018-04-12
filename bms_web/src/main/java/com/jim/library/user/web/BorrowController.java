package com.jim.library.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jim.library.user.service.BorrowService;
import com.jim.library.user.web.vo.BorrowInfoVo;

@Controller
@RequestMapping("/borrow")
public class BorrowController {

	@Autowired
	private BorrowService borrowService;

	@RequestMapping("/borrowBook")
	public String borrowBook(BorrowInfoVo borrowInfoVo) throws Exception {
		borrowService.borrowBook(borrowInfoVo.build());
		return "success";
	}

	@RequestMapping("/returnBook")
	public String returnBook(BorrowInfoVo borrowInfoVo) throws Exception {
		// System.out.println(borrowInfoVo.getBorrowInfo().getBook_ISBN());

		borrowService.returnBook(borrowInfoVo.build());
		return "success";
	}

	// 配置jsp跳转
	@RequestMapping("/toBorrowBook")
	public String toBorrowBook() {
		return "borrow/borrowBook";
	}

	@RequestMapping("/toReturnBook")
	public String toReturnBook() {
		return "borrow/returnBook";
	}

}
