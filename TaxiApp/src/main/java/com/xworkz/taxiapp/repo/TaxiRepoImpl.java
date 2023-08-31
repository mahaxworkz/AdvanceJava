package com.xworkz.taxiapp.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxiapp.dto.TaxiAppDto;

 

 
public class TaxiRepoImpl implements TaxiRepo {

	 
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	  EntityManager em = emf.createEntityManager();

	@Override
	public boolean saveTaxi( TaxiAppDto dto) {

		
		 
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		 

		 
	}

	@Override
	public boolean updateTaxiEarning(int amount, int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateEarning").setParameter("er", amount).setParameter("i", id);
		query.executeUpdate();

		em.getTransaction().commit();
		return true;
	}

	@Override
	public boolean taxiAvailableById(boolean status, int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateAvailability").setParameter("av", status).setParameter("i", id);
		query.executeUpdate();

		em.getTransaction().commit();
		return true;
	}

	@Override
	public List<TaxiAppDto> findTaxiByLocation(String location) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiAppDto> query = em.createNamedQuery("findByLocation", TaxiAppDto.class);
		query.setParameter("lo", location);
		List<TaxiAppDto> dto = query.getResultList();
		return dto;
	}

	@Override
	public List<TaxiAppDto> findTaxiAvailable( ) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiAppDto> query = em.createNamedQuery("findByAvailability", TaxiAppDto.class);
		 
		List<TaxiAppDto> dto = query.getResultList();
		return dto;
	}

	@Override
	public List<TaxiAppDto> readAll() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiAppDto> query = em.createNamedQuery("readAll", TaxiAppDto.class);

		List<TaxiAppDto> dto = query.getResultList();
		return dto;
	}

	@Override
	public boolean booking(int id,int earn) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("book");
		query.setParameter("i", id).setParameter( "er", earn);

		query.executeUpdate();
		System.out.println("booking sucessfully");

		em.getTransaction().commit();

		return true;

	}

	@Override
	public   TaxiAppDto Minvalue() {
		EntityManager em = emf.createEntityManager();

		TypedQuery<TaxiAppDto> query = em.createNamedQuery("book1", TaxiAppDto.class);
		

		 TaxiAppDto  dto= query.getSingleResult();
		if(dto!=null) {
			return dto;
		}
		System.out.println("no data");
		return null;

	}

	 

}
