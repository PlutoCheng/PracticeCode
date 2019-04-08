package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.demo.domain.Book;
import com.demo.service.IBookService;

@Controller
@RequestMapping("/demo")
public class BookController {

	@Autowired
	public IBookService bookService;
	@RequestMapping("/")
	@ResponseBody
	public List<Book> BookMessage(HttpServletResponse response) {
		Book book = new Book();
		List<Book> bookList = (List<Book>) bookService.getAllBook();
		//String bookMessage = JSON.toJSONString(bookList);
/*		response.addHeader("Access-Control-Allow-Origin","*");*/
		return bookList;
	}
	
	@RequestMapping("/book")
	@ResponseBody
	public String Book(HttpServletResponse response) {
		Book book = new Book();
			book.setId(1L);
			book.setAuthor("2");
			book.setDescription("3");
			book.setIsbn("4");
			book.setReader("5");
			book.setTitle("6666");
		String bookMessage = JSON.toJSONString(book);
		response.addHeader("Access-Control-Allow-Origin","*");
		return bookMessage;
	}
	

}
