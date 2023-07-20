package com.xworkz.forest.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.forest.config.Forsetconfig;
import com.xworkz.forest.dto.ForestDto;

public class ForestrepoImpl implements ForestRepo {
	SessionFactory sessionFactory =  Forsetconfig.getSessionFactory();
	 
	public boolean saving(ForestDto dto) {
		 Session session = sessionFactory.openSession();
		 Transaction tran = session.beginTransaction();
		 
		 
		 session .save(dto);
		 tran.commit();
		 session.close();
		 
		return false;
	}

	@Override
	public ForestDto Reading( int id) {
		 Session session = sessionFactory.openSession();
		 ForestDto readvaluse = session.get(ForestDto.class, id);
		 
		return readvaluse;
	}
	

	

	@Override
	public boolean FindByID(int id) {
		 Session session = sessionFactory.openSession();
		 ForestDto readvaluse = session.get(ForestDto.class, id);
		return false;
	}
	
	@Override
	public boolean UpdateByID(int id,String name) {
		 Session session = sessionFactory.openSession();
		 Transaction tran = session.beginTransaction();
		  ForestDto updating= session.get(ForestDto.class, id);
		  updating.setName(name);
		  session.update(updating);
		  tran.commit();
			 session.close();
		return false;
	}

	@Override
	public boolean Delete(int id) {
		 Session session = sessionFactory.openSession();
		 Transaction tran = session.beginTransaction();
		 ForestDto deleting= session.get(ForestDto.class, id);
		 session.delete(deleting);
		 tran.commit();
		 session.close();
		return false;
	}
	

}
