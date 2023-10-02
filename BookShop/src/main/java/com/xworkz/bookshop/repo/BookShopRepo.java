package com.xworkz.bookshop.repo;

import java.util.List;

import com.xworkz.bookshop.dto.BookDto;

public interface BookShopRepo {
	
	public boolean saveBook(BookDto dto);
	
	public BookDto findBookByName(String name);
	
	public List<BookDto> ReadAll();
	
	 

}
