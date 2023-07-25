package com.xworkz.toyfactory.repo;

 
 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

 
import com.xworkz.toyfactory.config.Toyconfig;
import com.xworkz.toyfactory.dto.ToyFactorydto;

public class ToyfactoryRepoImpl  implements ToyRepo {
	SessionFactory sessionFactory =   Toyconfig.getsessionFactory();
	 
	public boolean saving(ToyFactorydto dto) {
		Session session=sessionFactory.openSession();
       Transaction tran = session.beginTransaction();
		
		 session .save(dto);
		 tran.commit();
		 session.close();
	 
		return false;
	}
	@Override
	public ToyFactorydto FindByid(int id) {
		 
			 Session session = sessionFactory.openSession();
			 ToyFactorydto  readvaluse = session.get(  ToyFactorydto.class, id);
			 
			return readvaluse;
		
		 
	}

	@Override
	public  ToyFactorydto FindByName(String owner) {
		Session session=sessionFactory.openSession();
		String query="from  ToyFactorydto where owner= "+owner;
		Query<ToyFactorydto> reading=session.createQuery(query,ToyFactorydto.class);
		
		ToyFactorydto result=	reading.getSingleResult();
		 
		return  result;
	}

	 

	@Override
	public boolean Updateprofitbyname(String owner, int profit) {
		 
		Session session=sessionFactory.openSession();
		
		 Transaction tran = session.beginTransaction();
		 String query="from  ToyFactorydto where owner= "+owner;
			Query<ToyFactorydto> update=session.createQuery(query,ToyFactorydto.class);
			ToyFactorydto  updating=	 update.getSingleResult();
			updating.setProfit(profit);
			session.update(updating);
		  
		 tran.commit();
		 session.close();

		return true;
	}

	 

	 

	@Override
	public  List<ToyFactorydto>  readAll() {
		Session session=sessionFactory.openSession();
		Query<ToyFactorydto> readall=session.createQuery( "from ToyFactorydto ",ToyFactorydto.class);
		List<ToyFactorydto> listing=readall.list();
		return  listing;
	}

	 

	

	@Override
	public boolean updateFactorybyNameandid(String owner, int id, String factory) {
		
		Session session=sessionFactory.openSession();ToyFactorydto values=FindByid(id);
		ToyFactorydto values2=FindByid(id);
		 Transaction tran = session.beginTransaction();
		if(values.getId()==values2.getId()) {
			values.setFactoryName(factory);
			session.update(values);
			tran.commit();
			 session.close();
		}
		
		return false;
	}

	@Override
	public boolean deleteByid(int id) {
		Session session=sessionFactory.openSession();
		 Transaction tran = session.beginTransaction();
		 ToyFactorydto values=FindByid(id);
			 session.delete(values);
			 
		  
		 tran.commit();
		 session.close();
		return false;
	}
	
	
	
	

}
