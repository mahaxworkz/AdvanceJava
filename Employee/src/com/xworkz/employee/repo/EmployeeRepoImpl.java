package com.xworkz.employee.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
@Component
public class EmployeeRepoImpl implements EmployeeRepo {

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public boolean save(EmployeeDto dto) {
		if(em != null) {
			EntityTransaction trans=    em.getTransaction();
			trans.begin();
			em.persist(dto);
			trans.commit();
			return true;
		}
		 
		return false;
	}


	@Override
	public EmployeeDto findByName(String name) {
		 if(em!= null) {
		Query query=	 em.createNamedQuery("FindName").setParameter("nm", name);
	EmployeeDto dto	= (EmployeeDto) query.getSingleResult();
	System.out.println("merhod run");
		return dto;
		 }
		
		
		return  null;
	}


	@Override
	public EmployeeDto findByNameAndEmail(String name, String Email) {
		Query query=	 em.createNamedQuery("FindNameAndEmail").setParameter("nm", name).setParameter("em", Email);
		EmployeeDto dto	= (EmployeeDto) query.getSingleResult();
		return dto;
	}


	@Override
	public boolean updateageByName(String name, int age) {
		em.getTransaction().begin();
	Query query= em.createNamedQuery("UpdateByName").setParameter("ag", age).setParameter("nm", name);
	query.executeUpdate();
	System.out.println("updated");
	em.getTransaction().commit();
	 
		return  true;
	}


	 


	@Override
	public boolean deleteByName(String name) {
		em.getTransaction().begin();
		 Query query = em.createNamedQuery("deleteByName").setParameter("nm", name);
		 query.executeUpdate();
		 em.getTransaction().commit();
		return  true;
	}


	@Override
	public boolean deleteByNameandemail(String name, String email) {
		
		em.getTransaction().begin();
		 Query query = em.createNamedQuery("deleteByNameAndMail").setParameter("nm", name).setParameter("em", email);
		 query.executeUpdate();
		 em.getTransaction().commit();
		return true;
	}


	@Override
	public boolean updateAddressAndNameByid(String name, int id, String address) {
		em.getTransaction().begin();
		 Query query = em.createNamedQuery("UpdateAddressAndNameByid").setParameter("ad", address).setParameter("nm", name).setParameter("i", id);
		query.executeUpdate();
		em.getTransaction().commit();
		 return  true;
	}


	@Override
	public List<EmployeeDto> readAll() {
		Query query= em.createNamedQuery("readAll");
		
		 
		return query.getResultList(); 
		 
	}

}
