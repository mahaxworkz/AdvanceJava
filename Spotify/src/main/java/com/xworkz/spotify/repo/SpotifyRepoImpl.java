package com.xworkz.spotify.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.spotify.dto.SongDto;
@Component
public class SpotifyRepoImpl implements SpotifyRepo {
    @Autowired
	private EntityManagerFactory emf;
	
	
	@Override
	public boolean saveSong(SongDto dto) {
		EntityManager  em=	 emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dto);
		System.out.println("saved");
		em.getTransaction().commit();
		return true;
	}


	@Override
	public List<SongDto> ReadSong() {
		EntityManager  em=	 emf.createEntityManager();
	Query query=	em.createNamedQuery("read");
	List< SongDto >  dto= query.getResultList();
		return dto;
	}


	@Override
	public SongDto FindByName(String name) {
		EntityManager  em=	 emf.createEntityManager();
		Query query=	em.createNamedQuery("findByName").setParameter("nm", name);
		SongDto dto = (SongDto) query.getSingleResult();
		return dto;
	}

}
