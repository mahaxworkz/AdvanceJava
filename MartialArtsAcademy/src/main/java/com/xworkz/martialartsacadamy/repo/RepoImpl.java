package com.xworkz.martialartsacadamy.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

 
import com.xworkz.martialartsacadamy.dto.MartialDto;

public class RepoImpl implements MartialRepo {
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("databaseProperties");
	  EntityManager em=  emf.createEntityManager();
	@Override
	public boolean saving(MartialDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	@Override
	public MartialDto FindByName(String name) {
		String query= "from MartialDto where Acadamyname= " +name;
		TypedQuery< MartialDto> dto =em.createQuery(query, MartialDto.class );
		return dto.getSingleResult();
		   
	}

	@Override
	public MartialDto FindById(int id) {
		MartialDto dto= em.find(MartialDto.class, id);
		return dto;
	}

	@Override
	public boolean UpdatebynameAndId(String name, int  id, int fee) {
		MartialDto dto= FindById(id); 
		MartialDto dto2 = FindByName(name);
		em.getTransaction().begin();
		 
			 
		 dto.setFee(fee);
	em.merge(dto);
	em.getTransaction().commit();
	em.close();
		
		return false;
	}

	@Override
	public boolean updatebyId(String mastername, int id) {
		MartialDto dto= FindById(id);
		em.getTransaction().begin();
		dto.setMastername(mastername);
		em.merge(dto);
		em.getTransaction().commit();
		em.close();
		return  true;
	}

	@Override
	public boolean deleteById(int id) {
		MartialDto dto= FindById(id);
		em.getTransaction().begin();
		 
		 em.remove(dto);
		em.getTransaction().commit();
		em.close();
		return false;
	}

	@Override
	public List<MartialDto> readAll() {
		TypedQuery<MartialDto> query=em.createQuery("from MartialDto",  MartialDto.class);
		List<MartialDto> list=	query.getResultList();
		return  list;
	}

}
