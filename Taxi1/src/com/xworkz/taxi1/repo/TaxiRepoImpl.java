package com.xworkz.taxi1.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi1.dto.TaxiDto;

@Component
public class TaxiRepoImpl implements TaxiRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean saveTaxi(TaxiDto dto) {

		EntityManager em = emf.createEntityManager();
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}

		return false;
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
	public List<TaxiDto> findTaxiByLocation(String location) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("findByLocation", TaxiDto.class);
		query.setParameter("lo", location);
		List<TaxiDto> dto = query.getResultList();
		return dto;
	}

	@Override
	public List<TaxiDto> findTaxiAvailable(boolean available) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("findByAvailability", TaxiDto.class);
		query.setParameter("av", available);
		List<TaxiDto> dto = query.getResultList();
		return dto;
	}

	@Override
	public List<TaxiDto> readAll() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("readAll", TaxiDto.class);

		List<TaxiDto> dto = query.getResultList();
		return dto;
	}

	@Override
	public boolean booking(int id, boolean avail) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("book");
		query.setParameter("i", id).setParameter("av", avail);

		query.executeUpdate();
		System.out.println("booking sucessfully");

		em.getTransaction().commit();

		return true;

	}

	@Override
	public TaxiDto Minvalue() {
		EntityManager em = emf.createEntityManager();

		TypedQuery<TaxiDto> query = em.createNamedQuery("book1", TaxiDto.class);

		return query.getSingleResult();

	}

	 

}
