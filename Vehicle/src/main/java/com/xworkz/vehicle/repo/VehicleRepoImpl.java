package com.xworkz.vehicle.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.vehicle.dto.VehicleDto;

public class VehicleRepoImpl implements VehicleRepo {

	
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("databaseProperties");
    EntityManager em= emf.createEntityManager();
	@Override
	public boolean save(VehicleDto dto) {
		 em.getTransaction().begin();
		 em.persist(dto);
		 em.getTransaction().commit();
		 em.close();
		return false;
	}

	@Override
	public VehicleDto FindByName(String name) {
		Query query= em.createNamedQuery("findName");
		Query value=query.setParameter("n", name);
		
		 
		return  (VehicleDto) value.getSingleResult();
	}

	@Override
	public VehicleDto FindByConsumeAndPower(String consume, float power) {
		Query query= em.createNamedQuery("findconsumeAndPower");
		Query value1=query.setParameter("c",consume).setParameter("p", power);
		VehicleDto dto= (VehicleDto) value1.getSingleResult();
		return dto;
	}

	@Override
	public boolean UpdateTypeByName(String type, String name) {
		em.getTransaction().begin();
		Query query= em.createNamedQuery("updateType");
		Query updating = query.setParameter("t", type).setParameter("n", name);
		updating.executeUpdate();
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	@Override
	public boolean UpdateLaunchedAndPowerbyId(float power, int launch, int id) {
		em.getTransaction().begin();
		Query query= em.createNamedQuery("updateById");
		Query update02=query.setParameter("l",launch).setParameter("p", power  ).setParameter("i", id);
		update02.executeUpdate();
		em.getTransaction().commit();
		em.close();
		return true;
	}

	@Override
	public boolean deletebylaunch(int launch) {
		em.getTransaction().begin();
		Query query= em.createNamedQuery("deleteByLaunch");
		Query delete=query.setParameter("l", launch);
		delete.executeUpdate();
		System.out.println("deleted");
		em.getTransaction().commit();
		em.close();
		return true;
	}

}
