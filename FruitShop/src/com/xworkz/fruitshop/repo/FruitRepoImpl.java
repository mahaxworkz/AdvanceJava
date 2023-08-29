package com.xworkz.fruitshop.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.fruitshop.dto.FruitShopDto;
@Component
public class FruitRepoImpl implements FruitShopRepo {
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(FruitShopDto dto) {
	EntityManager em=	emf.createEntityManager();
	if(em != null) {
	em.getTransaction().begin();
	em.persist(dto);
	em.getTransaction().commit();
	return true;
	}
		return false;
	}

	@Override
	public List<FruitShopDto>  FindByName(String name) {
		EntityManager em=	emf.createEntityManager();
		TypedQuery<FruitShopDto> query=	em.createNamedQuery("findByName", FruitShopDto.class);
		query.setParameter("nm", name);
		List<FruitShopDto> dto=   query.getResultList(); 
		 if(!dto.isEmpty()) {
			 
			 return  dto;
		 }
		 
		 
		System.out.println("dto is null");
		return null;
	}

//	@Override
//	public FruitShopDto FindByName1(String name) {
//		EntityManager em=	emf.createEntityManager();
//		TypedQuery<FruitShopDto> query=	em.createNamedQuery("findByName", FruitShopDto.class);
//		query.setParameter("nm", name);
//		 FruitShopDto  dto=   query.getSingleResult(); 
//		 if(!dto.getShopName().isEmpty()) {
//			 
//			 
//			 return  dto;
//		 }
		 
		 
//		System.out.println("dto is null");
//		return null;
//	}

	 

}
