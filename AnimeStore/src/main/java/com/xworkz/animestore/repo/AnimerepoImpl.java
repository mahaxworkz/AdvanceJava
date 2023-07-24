package com.xworkz.animestore.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.xworkz.animestore.dto.AnimeDto;

public class AnimerepoImpl implements AnimeRepo {
	 EntityManagerFactory emf =  Persistence.createEntityManagerFactory("databaseProperties");
	  EntityManager em=  emf.createEntityManager();
	 
	public boolean Save(AnimeDto dto) {
		 em.getTransaction().begin();
		  em.persist(dto);
		  em.getTransaction().commit();
		  em.close();		   
		return  true;
	}

	@Override
	public List<AnimeDto> Readall() {
		TypedQuery<AnimeDto> query=em.createQuery("from AnimeDto", AnimeDto.class);
		List<AnimeDto> list=	query.getResultList();
		return  list;
	}

	@Override
	public AnimeDto findByname(String name) {
		String query = "from AnimeDto where  name =  "+name; 
		TypedQuery<AnimeDto> dto =em.createQuery(query, AnimeDto.class );
		//TypedQuery<AnimeDto> dto = em.createNamedQuery( query, AnimeDto.class);
		
		
		return  dto.getSingleResult(); 
	}

	@Override
	public boolean updatebranchesById(int id, int branch) {
		AnimeDto dto = em.getReference(AnimeDto.class, id);
		em.getTransaction().begin();
		dto.setNoOfBranches(branch);
		em.merge( dto);
		em.getTransaction().commit();
		em.close();
		return  true;
	}

	@Override
	public boolean UpdateAreaByname(String area, String name) {
	AnimeDto result= findByname(name);
	em.getTransaction().begin();
	result.setArea(area);
	em.merge(result);
	em.getTransaction().commit();
	em.close();
	
		return false;
	}

	@Override
	public boolean DeleteById(int id) {
		AnimeDto dto = em.getReference(AnimeDto.class, id);
		em.getTransaction().begin();
		 
		em.remove(dto);
		em.getTransaction().commit();
		em.close();
		return false;
	}

	@Override
	public boolean DeleteByname(String name) {
		AnimeDto result= findByname(name);
		em.getTransaction().begin();
		 
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		return false;
	}

}
