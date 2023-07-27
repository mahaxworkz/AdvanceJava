package com.xworkz.musicapp.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.musicapp.dto.MusicDto;

public class MusicRepoImpl implements MusicRepo {

	EntityManagerFactory emf =Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em= emf.createEntityManager();
	@Override
	public boolean save(MusicDto dto) {
		 em.getTransaction().begin();
		 em.persist(dto);
		 em.getTransaction().commit();
		 em.close();
		return true;
	}

	@Override
	public List<MusicDto> Readall() {
		Query query= em.createNamedQuery("Readall");
		
		 
		return query.getResultList();
	}

	@Override
	public MusicDto FindByName(String name) {
		Query query= em.createNamedQuery("FindName");
	Query value=	query.setParameter("n", name);
	MusicDto dto= (MusicDto) value.getSingleResult();
		return  dto;
	}

	@Override
	public boolean updateAppsizeAndRatingByName(float size, float rate, String name) {
		em.getTransaction().begin();
		Query query= em.createNamedQuery("updatesize");
		Query value=query.setParameter("si", size).setParameter("rt", rate).setParameter("n", name);
		 value.executeUpdate();
		 
		em.getTransaction().commit();
		return true;
	}

	@Override
	public boolean Deletebyid(int id) {
		em.getTransaction().begin();
	Query query=	em.createNamedQuery("deletebyid");
	Query value=	query.setParameter("i", id);
		
		value.executeUpdate();
		em.getTransaction().commit();
		return false;
	}

}
