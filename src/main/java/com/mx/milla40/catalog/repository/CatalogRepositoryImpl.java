package com.mx.milla40.catalog.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;

import com.mx.milla40.catalog.models.Catalog;

@Repository
public class CatalogRepositoryImpl implements CatalogRepository{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	private Session currentSession() {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
			//Temporally method (check success connection)
			session.doWork(new Work() {
			    @Override
			    public void execute(Connection connection) throws SQLException {
			    	System.out.println("success conexion");
			    }
			});		
		}
		

		
		return session;
	}	
	
	@Override
	public int getNumberOfRows(Class<? extends Catalog> clazz) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Catalog findRow(long pk, Class<? extends Catalog> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Catalog findRow(String value, Class<? extends Catalog> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, String> listMap(Class<? extends Catalog> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Catalog> listRows(Class<? extends Catalog> clazz) {
		Criteria criteria = currentSession().createCriteria(clazz);
		List<Catalog> listRows = criteria.list();
		return listRows;
	}

	@Override
	public void addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCatalog(long pk) {
		// TODO Auto-generated method stub
		
	}

	
}
