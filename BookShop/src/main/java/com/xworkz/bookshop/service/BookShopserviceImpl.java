package com.xworkz.bookshop.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.bookshop.dto.BookDto;
import com.xworkz.bookshop.repo.BookShopRepo;
 

@Service
public class BookShopserviceImpl implements BookshopService {
   @Autowired
	private BookShopRepo repo;
	@Override
	public boolean saveBook(BookDto dto, Model model) {
		if(!checkExists(dto.getBookName(),model)) {
		if(validatebook(dto, model)) {
			 
			  model.addAttribute("check", "Saved sucessfully !!!");
			  return repo.saveBook(dto);
		  }
		System.out.println("invalid data");
		  
		return false;
		}
		 System.out.println("already exist data");
		 model.addAttribute("check", "already exist");
		return false;
	}
	@Override
	public boolean validatebook(BookDto dto, Model model) {
		 boolean valid = true; 
		    System.out.println("method validation");
		    if (dto.getBookName() != null && dto.getAuthorName() != null) {
		        if (dto.getAuthorName().length() <= 3 || dto.getAuthorName().isEmpty()) {
		        	 model.addAttribute("isauthorvalid", "Author name not valid");
		            valid = false;  
		        }
		        
		        if (dto.getBookName().length() <= 3 || dto.getBookName().isEmpty()) {
		        	 model.addAttribute("isbookvalid", "Book name not valid");
		            valid = false;  
		        }
		        
		        if (dto.getPublishedin() <= 1900) {
		        	model.addAttribute("isyearvalid", "published year not valid");
		            valid = false;  
		        }
		        if (dto.getContent().length() <= 3 || dto.getContent().isEmpty()) {
		            model.addAttribute("IsratingValid", "LowRating");
		            valid = false;  
		        }
		        
		        if (dto.getLanguage().isEmpty() || dto.getLanguage().length() <= 3 ) {
		            model.addAttribute("IsAlbumValid", "Album not Valid");
		            valid = false;  
		        }
		        if (dto.getPublisher().isEmpty() || dto.getPublisher().length() <= 3 ) {
		            model.addAttribute("IsAlbumValid", "Album not Valid");
		            valid = false;  
		        }
		    } else {
		        System.out.println("null value");
		        valid = false;  
		    }

		    if (!valid) {
		        System.out.println("false scenario: " + model.asMap());
		    }
		    
		    return valid; 
			 
	 
		 
	}
	
	public boolean checkExists(String name,Model model ) {
		 
		 if( findByName(name ,model)!= null) {
			 System.out.println("given dto is not null from checkExists");
			 
			return true; 
		 }
		 System.out.println("dto0 service");
		return false;
		
		 
	}
	@Override
	public  BookDto  findByName(String name ,Model model) throws NoResultException {
		
		try {
		if(name!= null) {
			BookDto list= repo.findBookByName(name);
			System.out.println("given dto is null from FindByName");
			 
			return list;
		}
		 
		 
			 
		}catch(NoResultException e) {
			e.printStackTrace();
			System.out.println("dto null");
			return null;
		}
		
		model.addAttribute("find", "notfound ");
		return null;
		
		 
		 
		 
		 
	}
	@Override
	public List<BookDto> ReadAll() {
		 
		return repo.ReadAll();
	}

}
