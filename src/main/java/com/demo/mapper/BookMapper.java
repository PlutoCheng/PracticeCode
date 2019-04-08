package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.domain.Book;

@Mapper
public interface BookMapper {
	List<Book> getAllBook();
}
