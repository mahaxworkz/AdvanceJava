package com.xworkz.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.bookshop.dto.BookDto;
import com.xworkz.bookshop.service.BookshopService;

import net.bytebuddy.asm.Advice.Return;

@Controller
public class BookController {
	@Autowired
	private BookshopService service;
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveBook(BookDto dto,Model model) {
		
		boolean save= service.saveBook(dto, model);
		if(save) {
			model.addAttribute("saved", "Saved sucessfully");
		}
		return "save";
		
	}
	@RequestMapping(value="/read",method = RequestMethod.GET)
	public String ReadAll(Model model) {
		
		 List<BookDto> list= service.ReadAll();
		if(list != null) {
			model.addAttribute("read", list);
		}
		return "Booklist";
		
	}

	@RequestMapping(value="/find",method = RequestMethod.GET)
	public String Find(@RequestParam String bookName,Model model) {
		
		BookDto dto= service.findByName( bookName ,model);
		if(dto != null) {
			model.addAttribute("reading", dto);
		}
		else {
			model.addAttribute("found","data not found");
		}
		 		return "Booklist";
		
	}
}
