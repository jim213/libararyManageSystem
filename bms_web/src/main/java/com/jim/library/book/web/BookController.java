 package com.jim.library.book.web;

import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jim.library.book.domain.BookQueryBo;
import com.jim.library.book.entity.Book;
import com.jim.library.book.service.BookService;
import com.jim.library.book.web.vo.BookQueryVo;
import com.jim.library.exception.BmsException;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/findBookByISBN")
	public ModelAndView findBookByISBN(BookQueryVo bookQueryVo) throws Exception {

		BookQueryBo bookBo = bookService.findBookByISBN(bookQueryVo.build());
		
		ModelAndView modelAndView = new ModelAndView();

		if (Objects.nonNull(bookBo)) {
			
			modelAndView.addObject("bookBo", bookBo);
			
			modelAndView.setViewName("book/bookInfo");
			
			return modelAndView;
		}
		throw new BmsException("查找的图书信息不存在");
		// modelAndView.setViewName("book/noBookFound");

	}

	@RequestMapping("/findBooksList")
	public ModelAndView findBooksList(BookQueryVo bookQueryVo) throws Exception {

		List<BookQueryBo> booksList = bookService.findBooksList(bookQueryVo.build());

		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("booksList", booksList);
		
		modelAndView.setViewName("book/booksList");

		return modelAndView;
	}

	@RequestMapping("/addBook")
	public String addBook(BookQueryVo bookQueryVo) throws Exception {

		bookService.addBook(bookQueryVo.build());
		
		return "success";
	}

	@RequestMapping("/updateBook")
	public String updateBook(Book book, MultipartFile bookPic) throws Exception {

		// 图片处理
		String originalFilename = bookPic.getOriginalFilename();
		
		if (bookPic != null && originalFilename != null && originalFilename.length() > 0) {

			// 存储图片的物理路径
			String picPath = "F:\\develop\\upload\\temp\\";

			// 新的图片名称
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			
			// 新图片
			File newFile = new File(picPath + newFileName);

			// 将内存中的数据写入磁盘
			bookPic.transferTo(newFile);

			// 将新图片名称写到book中
			book.setPic(newFileName);
		}

		BookQueryVo bookQueryVo = new BookQueryVo(book);

		bookService.updateBook(bookQueryVo.build());

		return "success";
	}

	@RequestMapping("/deleteBook")
	public String deleteBook(BookQueryVo bookQueryVo) throws Exception {
		
		bookService.deleteBook(bookQueryVo.build());
		
		return "success";
	}

	// 配置jsp跳转
	@RequestMapping("/toFindBooksList")
	public String toFindBooksList() {
		return "book/findBooksList";
	}

	@RequestMapping("/toFindBookByISBN")
	public String toFindBookByISBN() {
		return "book/findBookByISBN";
	}

	@RequestMapping("/toaddBook")
	public String toaddBook() {
		return "book/addBook";
	}

}
