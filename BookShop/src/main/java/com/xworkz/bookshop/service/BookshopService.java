package com.xworkz.bookshop.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.bookshop.dto.BookDto;

public interface BookshopService {
	
	public boolean saveBook(BookDto dto ,Model model);
	public boolean validatebook(BookDto dto, Model model);
	public boolean checkExists(String name,Model model);
	public BookDto findByName(String name ,Model model);
	public List<BookDto> ReadAll();
	

}
