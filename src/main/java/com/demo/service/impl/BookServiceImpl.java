package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import com.demo.domain.Book;
import com.demo.mapper.BookMapper;
import com.demo.service.IBookService;

@Service
@CacheConfig(cacheNames = "book")
public class BookServiceImpl implements IBookService{
	@Autowired
	private BookMapper bookMapper;
	@Cacheable
	public List<Book> getAllBook() {
		return bookMapper.getAllBook();
	}
}
