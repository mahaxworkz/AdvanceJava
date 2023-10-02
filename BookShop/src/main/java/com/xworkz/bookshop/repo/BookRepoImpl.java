package com.xworkz.bookshop.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.bookshop.dto.BookDto;
 

@Repository
public class BookRepoImpl implements BookShopRepo {
	
    @Autowired
	private EntityManagerFactory emf;
	@Override
	public boolean saveBook(BookDto dto) {
		 
	EntityManager em=	emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(dto);
	em.getTransaction().commit();
	
	
		return true;
	}
	@Override
	public BookDto findBookByName(String name) {
		EntityManager em=	emf.createEntityManager();
		TypedQuery<BookDto> query=	em.createNamedQuery("exists", BookDto.class);
		query.setParameter("nm", name);
		BookDto  dto=   query.getSingleResult(); 
		 if(dto != null) {
			 
			 return  dto;
		 }
		 
		 
		System.out.println("dto is null");
		return null;
	}
	@Override
	public List<BookDto> ReadAll() {
		EntityManager em=	emf.createEntityManager();
		TypedQuery<BookDto> query=	em.createNamedQuery("readall", BookDto.class);
		List<BookDto> list= query.getResultList();
		return list;
	}

}
